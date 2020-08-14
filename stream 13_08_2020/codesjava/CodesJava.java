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
     * Метод добавления животного в список. Метод достаточно шатко стоящий на
     * костылях. Предполагаетcя, что человек вводит с клавиатуры имя животного
     * которое он хочет добавить в список, причем это имя совпадает с именем
     * класса вплоть до регистра, а сам класс лежит в пакете codesjava. Ошибки
     * ввода не обрабатываются и падают с исключением. Далее предполагается,
     * что класс будет иметь доступный конструктор без параметров. 
     * 
     * Метод может быть доработан по желанию.
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
        zoo.add((Moo)cl3.getDeclaredConstructor().newInstance());      
    }
}