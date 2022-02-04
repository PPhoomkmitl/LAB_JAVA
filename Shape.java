public class Shape {
    private Point center;
    private int width;
    private int height;

    public double calcuateArea() {
        return width * height;
    }

    public Point getPoint() {
        return center;
    }

    public Shape(Point p, int w, int h) {
        this.center = p;
        this.width = w;
        this.height = h;
    }

    public Shape(int x, int y, int w, int h) {
        center = new Point(x, y);
        this.width = w;
        this.height = y;
    }

}
