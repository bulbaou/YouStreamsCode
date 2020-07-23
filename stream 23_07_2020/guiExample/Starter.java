package guiExample;

public class Starter {

    public static void main(String[] args) {
        int width = 1000;
        int height = 800;
        Rectangle[] recs = RecangleGenerators.getRectangles(10, width, height);
        DrawFrame b = new DrawFrame("Testing Objects",recs,width,height);
    }
}
