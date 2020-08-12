package codesjava;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  Ermakov Alexander
 */
public class Temperature implements Comparable<Temperature>{
    private static List<Temperature> temps= new ArrayList<>();
    
    public static final Temperature COLD=new Temperature("COLD", -10);
    public static final Temperature GOOD=new Temperature("GOOD", 20);
    public static final Temperature HOT=new Temperature("HOT", 35);
    
    static{
        temps.add(COLD);
        temps.add(GOOD);
        temps.add(HOT);
    }
    
    private String name;
    private int t;
    
    private Temperature(String name, int t) {
        this.name = name;
        this.t = t;
    }

    public static Temperature getTemperature(String name){
        return temps.stream()
                .filter(x->x.name.equals(name))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("element "+name+ " not found at Temperature class"));                
    } 

    public String getName() {
        return name;
    }

    public int getT() {
        return t;
    }
    
    public static Temperature[] values() {
        return temps.toArray(x->new Temperature[x]);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Temperature t) {
        return this.t-t.t;
    }
    
}