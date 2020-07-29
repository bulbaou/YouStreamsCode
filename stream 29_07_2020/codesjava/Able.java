package codesjava;
/**
 * Интерфейс {@code Able} является примером наследования дефлотных методов от
 * нескольких родительских интерфейсов. В данном случае заявлено, что будет
 * использоваться реализация указанная у родителя {@code Bable}.
 * 
 * @author  Ermakov Alexander
 */
public interface Able extends Bable,Dable{    
    default int met2(){
        return Bable.super.met2();
    }
}