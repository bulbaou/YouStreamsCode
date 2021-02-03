package codesjava;

import java.util.ArrayList;
import java.util.List;

/**
 * Структура для хранения набора функций
 * 
 * @author Ermakov Alexander
 */
public class Funs {
	 /**
     * Метод применяющий действие к каждому элементу списка
     * @param x
     *      исходный список
     * @param action
     *      применяемое действие
     * @return 
     *      список с новыми значениями
     * @author Ermakov Alexander
     */ 
    public static <T,R>  List<R> map(List<T> x, Changer<T,R> action){
        List<R> res=new ArrayList<>();
        for(int i=0;i<x.size();i++){
            res.add(action.act(x.get(i)));
        }
        return res;
    }
	/**
     * Метод сводящий список к одному элементу
     * @param startVal
     *      начальное значение	 
     * @param x
     *      исходный список
     * @param action
     *      применяемое действие
     * @return 
     *      результирующее значение
     * @author Ermakov Alexander
     */ 
    public static <T>  T reduce(T startVal,List<T> x, Action<T> action){
        T res=startVal;
        for(int i=0;i<x.size();i++) res=action.act(res,x.get(i));
        return res;
    }
	/**
     * Метод отбрасывающий все элементы не прошедшие условие 
     * @param x
     *      исходный список
     * @param uslovie
     *      условие
     * @return 
     *      список всех значений удовлетворивших условию
     * @author Ermakov Alexander
     */ 	
    public static <T>  List<T> filter(List<T> x, Uslovie<T> uslovie){
        List<T> res=new ArrayList<>();
        for(int i=0;i<x.size();i++){
            if(uslovie.act(x.get(i)))res.add(x.get(i));
        }
        return res;
    }
}