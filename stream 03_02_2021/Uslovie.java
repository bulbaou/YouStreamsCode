package codesjava;
/**
 * Функциональный интерфейс описывающий условие
 * @author Ermakov Alexander
 */
@FunctionalInterface
public interface Uslovie<T>{
    boolean act(T y);
}