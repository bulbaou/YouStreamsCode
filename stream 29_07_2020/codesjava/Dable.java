package codesjava;
/**
 * Интерфейс {@code Dable} необходим для демонстрации множественного наследования
 * в интерфейсе  {@code Able}. 
 * 
 * @author  Ermakov Alexander
 */
public interface Dable{
    default int met2(){
        return 0;
    }
}