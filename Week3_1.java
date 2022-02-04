import java.util.Scanner;

public class Week3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a circle:");
        double r = sc.nextDouble();
        if (r <= 0) {
            System.out.println("Input must be more than 0");
        } else {
            System.out.print("Enter the X position of a circle: ");
            int x = sc.nextInt();
            System.out.print("Enter the Y position of a circle: ");
            int y = sc.nextInt();
            Point p = new Point(x, y);
            Circle c = new Circle(p, r);
            Image im = new Image();
            Point p1 = new Point(110, 200);
            Circle c1 = new Circle(p1, 50);
            im.addShape(c);
            im.addShape(c1);
            im.draw();

        }
        sc.close();
    }
}
