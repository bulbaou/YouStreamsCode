package codesjava;

public class Point{
    //поля
    int x, y;
    
    //для создания объекта надо указать обе его координаты
    public Point(int xС, int yС) {
        x = xС;
        y = yС;
    }

    //метод приведения к строке
    public String toString() {
        return "{" + x + ';' + y + '}';
    }
    
}