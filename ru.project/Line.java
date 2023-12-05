public class Line {
    Point start;
    Point end;

    Line (Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    Line (int x1, int y1, int x2, int y2) {
        start = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }

}
