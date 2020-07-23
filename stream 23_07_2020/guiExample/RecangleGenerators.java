package guiExample;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Александр
 */
public class RecangleGenerators {    
    private static Random random = new Random();

    public static Rectangle[] getRectangles(int shapesNum, int maxX, int maxY){
        Rectangle[] arr=new Rectangle[shapesNum];
        for (int i = 0; i < shapesNum; i++) {
            Point p = new Point(random.nextInt(maxX), random.nextInt(maxY));
            Color color = getRandomColor();
            arr[i]=new Rectangle(p, random.nextInt(maxX-p.x), random.nextInt(maxY-p.y), color);
        }
        return arr;
    }   
 
    static Color getRandomColor() {
        float alpha = random.nextFloat();
        float red = random.nextFloat();
        float green = random.nextFloat();
        float blue = random.nextFloat();
        return new Color(red, green, blue, alpha);
    }
}
