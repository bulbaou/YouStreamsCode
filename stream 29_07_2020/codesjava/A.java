package codesjava;

/**
 * Класс {@code A} показывает пример реализации нескольких интерфейсов.
 * В частности он реализует метод test для интерфейса {@code Testable}
 * и met для {@code Able}, а также наследует дефолтную реализацию метода met2
 * 
 * @author  Ermakov Alexander
 */
public class A implements Testable,Able{
    public void test(){
        System.out.println("A");
    }    
    public void met(){}
}