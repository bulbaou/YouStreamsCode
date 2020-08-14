package codesjava;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Александр
 */
public class CodesJava {

    public static void main(String[] args) throws Exception {
        starter();
    }
    /**
     * Метод для реализации консольного меню. Крайне простой и быстро написанный,
     * без обработки ввода и так далее. При выборе цифры 3 происходит выход
     * при выборе цифры 2 происходит обход животных из набора и вызов у
     * каждого метода moo. Обратите внимание, что все животные хранятся
     * по интерфейсной ссылке типа Moo. При нажатии на 1 предлагается ввести
     * имя животного для добавления в список. 
     * @author Alexander Ermakov
     */
    public static void starter() throws Exception {
        List<Moo> zoo = new ArrayList<>();
        while (true) {
            System.out.println("1.Добавить животное\n"
                    + "2.Пройтись по зоопарку\n"
                    + "3.Выход");
            int choose = new Scanner(System.in).nextInt();
            if (choose == 3) {
                System.exit(0);
            } else if (choose == 2) {
                for(Moo moo:zoo) moo.moo();
            } else if (choose == 1) {
                addMoo(zoo);
            }
        }

    }
    /**
     * Альтернативный метод обхода зоопарка. На вход принимается набор объектов
     * тип которых неизвестен, однако мы предполагаем, что среди них могут
     * оказаться такие, у которых присутствует метод moo. Хотелось бы нам 
     * сказать, что все такие объекты реализуют интерфейс Moo, но вероятно
     * это не так. Да еще и доступность данных методов может быть неопределена.
     * В итоге, у всех кто имеет метод moo без параметров он будет вызыван.
     * 
     * @author Alexander Ermakov
     */
    public static void walkZoo(List<Object> zoo) {
        for (Object m : zoo) {
            try {
                Method met = m.getClass().getDeclaredMethod("moo");
                met.setAccessible(true);
                met.invoke(m);
            } catch (Exception ex) {}
        }
    }
    /**
     * Метод добавления животного в список. Метод достаточно шатко стоящий на
     * костылях. Предполагаетcя, что человек вводит с клавиатуры имя животного
     * которое он хочет добавить в список, причем это имя совпадает с именем
     * класса вплоть до регистра, а сам класс лежит в пакете codesjava. Ошибки
     * ввода не обрабатываются и падают с исключением. Далее предполагается,
     * что класс будет иметь доступный конструктор без параметров. 
     * 
     * Это обновленная версия, в которой проверяется, что добавляемое
     * животное реализует Moo. Если это не так, то через класс Reflector
     * создается класс потомок требуемого животного, причем этот потомок
     * реализует требуемый интерфейс, и уже объект этого потомка добавляется
     * в список. Таким образом объект требуемого класса подменяется на другой
     * незаметно для пользователя.
     * 
     * @param zoo
     *      Список в который надо добавить животное
     * @throws java.lang.Exception
     *      Кидает рефлексивные исключения если класс или пустой 
     *      конструктор не найден или недоступен
     * @author Alexander Ermakov
     */
    public static void addMoo(List<Moo> zoo) throws Exception {
        String name = new Scanner(System.in).nextLine();
        Class cl3 = Class.forName("codesjava." + name);
        List<Class> lst=Arrays.asList(cl3.getInterfaces());
        if(lst.contains(Moo.class)){
            zoo.add((Moo)cl3.getDeclaredConstructor().newInstance());
        }else{
            Constructor cons=Class.forName(Reflector.adapt(cl3, Moo.class)).getDeclaredConstructor();
            cons.setAccessible(true);
            zoo.add((Moo)cons.newInstance());
        }
    }
}