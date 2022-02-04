import java.util.ArrayList;

//64050191 ภูมิรพี ศรีฟ้า
public class Image {
    private ArrayList<Circle> circle = new ArrayList<Circle>();

    public void addShape(Circle circle) {
        this.circle.add(circle);
    }

    public void draw() {
        for (int i = 0; i < circle.size(); i++) {
            System.out.println(circle.get(i).toString());
        }
    }
}
