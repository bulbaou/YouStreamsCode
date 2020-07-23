package guiExample;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import java.awt.Color;

public class DrawFrame extends JFrame {

    private Rectangle[] rectangles;
    int width;
    int height;
    
    public DrawFrame(String title, Rectangle[] recs , int width, int height) {
        super(title);
        setVisible(true);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);        
        this.width=width;
        this.height=height;
        rectangles=recs;
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;  
        g2.setBackground(Color.white);
        g2.clearRect(0, 0, width, height);
        for (Rectangle r : rectangles) {
            g2.setColor(r.color);
            g2.fill(r.getPolygon());
        }
    }
}
