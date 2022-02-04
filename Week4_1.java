public class Week4_1 {
    public static void main(String[] args) {
        int x = 200, y = 500;
        double r = 30;
        Circle c1 = new Circle(new Point(200, 500), r);
        Circle c2 = new Circle(x, y, r);
        System.out.println(c1);
        System.out.println(c2);
    }
}
