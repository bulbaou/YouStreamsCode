package codesjava;

import java.util.ArrayList;
import java.util.List

/**
 * Класс потоковой обработки данных. Создается через конструктор, запоминающий ссылку на
 * список, который и будет обрабатываться потоково. Внутри хранит список действий, которые надо применить. Через
 * методы map и filter добавляем требуемые действия.
 * @author Ermakov Alexander
 */
public class Potok<T> {
    private List<T> x;
    private List acts;
    
    public Potok(List<T> x) {
        this.x = x;
    }
    
    public <R>  Potok<R> map(Changer<T,R> action){
        acts.add(action);
        return (Potok<R>)this;
    }
	
    public T reduce(T startVal,Action<T> action){
        T res=startVal;
        for(int i=0;i<x.size();i++){
            //выполнить все действия из acts
            res=action.act(res,x.get(i));
        }
        return res;
    }
	
    public Potok<T> filter(Uslovie<T> uslovie){
        acts.add(uslovie);
        return this;
    }
}