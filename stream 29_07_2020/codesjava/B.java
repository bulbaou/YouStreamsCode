package codesjava;

/**
 * Класс {@code B} показывает пример одновременного наследования и реализации.
 * В частности он наследует методы met и дефлотную реализацию met2, 
 * а также переопределяет test. Дополнительно данный класс самостоятельно
 * реализует метод test(String) из TestableString. К объектам
 * данного класса можно получить доступ через множество типов ссылок:
 * Object, A, B, Testable, TestableString, Able, Bable, Dable.
 * 
 * @author  Ermakov Alexander
 */
public class B extends A implements TestableString{      
    public void test(){
        System.out.println("B");
    }
    
    public void test(String txt){
        System.out.println("B"+txt);
    }
}