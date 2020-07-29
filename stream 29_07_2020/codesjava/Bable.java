package codesjava;
/**
 * Интерфейс {@code Bable} демонстрирует возможность иметь несколько методов
 * в одном интерфейсе. В данном случае один метод абстрактный, а другой
 * имеет реализацию по умолчанию. 
 * 
 * @author  Ermakov Alexander
 */
public interface Bable{
    void met();
    
    default int met2(){
        return 22;
    }
}