package codesjava;

public class Name implements Comparable<Name>{
    String str;

    public Name(String str) {
        this.str = str;
    }

    @Override
    public int compareTo(Name o) {
        return o.str.length()-this.str.length();
    }

    @Override
    public String toString() {
        return str;
    }
    
}