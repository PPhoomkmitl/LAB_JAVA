//64050191 ภูมิรพี ศรีฟ้า
class Circle extends Shape {

    private double radius;
    // private Point p;
    public static double PI = 3.1416;

    Circle(int x, int y, double radius) {
        super(new Point(x, y), 0, 0);
        this.radius = radius;
    }

    Circle(Point p, double radius) {
        super(p, 0, 0);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double scale(double s) {
        return radius = radius * s;
    }

    @Override
    public String toString() {
        return "I am at " + getPoint() + " with radius = " + radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void moveLeft(int d) {
        getPoint().moveLeft(d);
    }

    public void moveRight(int d) {
        getPoint().moveRight(d);
    }

    public void moveUp(int d) {
        getPoint().moveUp(d);
    }

    public void moveDown(int d) {
        getPoint().moveDown(d);
    }
}
