package codesjava;
/**
 * Функциональный интерфейс описывающий действие над двумя операндами
 * и возвращающий значение такого же типа как и операнды
 * @author Ermakov Alexander
 */
@FunctionalInterface
public interface Action<T>{
    T act(T x,T y);
}