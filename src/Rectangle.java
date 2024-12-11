public class Rectangle extends Shape implements Movable {
    private double length;
    private double breadth;
    private int x, y;

    public Rectangle(int x, int y, double length, double breadth) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return length * breadth;
    }

    @Override
    public void displayShapeName() {
        System.out.println("Drawing a Rectangle with length " + length + " and breadth " + breadth);
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", breadth=" + breadth + ", position=(" + x + "," + y + "), " + super.toString() + "]";
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public String getCoordinates() {
        return "(" + x + ", " + y + ")";
    }
}
