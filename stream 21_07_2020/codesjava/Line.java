package codesjava;

public class Line{
    Point start,end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public String toString() {
        return "Line from "+ start + " to " + end;
    }
    
    //Необходимо реализовать данный метод
    public int length(){
        return 0;
    }
}







