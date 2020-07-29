package codesjava;

/**
 * Класс {@code NameComparator} позволяет сравнить два объекта типа {@code Name}. 
 * Чем короче имя, тем оно лучше.
 * 
 * @author  Ermakov Alexander
 */
public class NameComparator implements Comparator<Name>{

    @Override
    public int compare(Name o1, Name o2) {
        return o2.str.length()-o1.str.length();
    }
    
}