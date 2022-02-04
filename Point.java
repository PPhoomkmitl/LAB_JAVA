public class Point {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int moveLeft(int d) {
        return x -= d;
    }

    public int moveRight(int d) {
        return x += d;
    }

    public int moveUp(int d) {
        return y += d;
    }

    public int moveDown(int d) {
        return y -= d;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
