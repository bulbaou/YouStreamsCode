package codesjava;
/**
 * Функциональный интерфейс описывающий действие над операндом
 * и возвращающий значение такого же или любого другого типа
 * @author Ermakov Alexander
 */
@FunctionalInterface
public interface Changer<T,R>{
     R act(T y);
}