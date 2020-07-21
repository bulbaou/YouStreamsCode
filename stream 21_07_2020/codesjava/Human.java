package codesjava;

public class Human {
    //поля
    Human parent;
    String name;
    
    //для создания человека надо указать его имя
    public Human(String name) {        
        this.name = name;
    }

    //метод приведения к строке
    public String toString() {
        return "Human{" + "parent=" + parent + ", name=" + name + '}';
    }
    
}