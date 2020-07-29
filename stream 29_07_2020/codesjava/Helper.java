package codesjava;
/**
 * Интерфейс {@code Helper} является примером вспомогательного интерфейса. 
 * В отличии от остальных интерфейсов он предназначе не для формирования ссылки
 * а для хранения констнант и статических методов. 
 * 
 * @author  Ermakov Alexander
 */
public interface Helper{
    int ANSWER=42;
    public static int pow(int x){
        return x*x;
    }
    private static int pow2(int x){
        return x*x;
    }
}