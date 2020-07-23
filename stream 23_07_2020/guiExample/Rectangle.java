package guiExample;

import java.awt.Color;
import java.awt.Polygon;

/**
 *
 * @author Александр
 */

public class Rectangle {

    Point leftUp;
    int a, b;
    Color color;

    public Rectangle(Point leftUp, int a, int b, Color color) {
        this.leftUp = leftUp;
        this.a = a;
        this.b = b;
        this.color = color;
    }   

    public Polygon getPolygon() {
        Polygon outline = new Polygon();
        outline.addPoint(leftUp.x, leftUp.y);
        outline.addPoint(leftUp.x+a, leftUp.y);        
        outline.addPoint(leftUp.x+a, leftUp.y+b);
        outline.addPoint(leftUp.x, leftUp.y+b);
        return outline;
    }
}
