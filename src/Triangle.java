public class Triangle extends Shape implements Movable {
    private double base;
    private double height;
    private int x, y; // Coordinates for the triangle's position

    public Triangle(int x, int y, double base, double height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void displayShapeName() {
        System.out.println("Drawing a Triangle with base " + base + " and height " + height);
    }

    @Override
    public String toString() {
        return "Triangle[base=" + base + ", height=" + height + ", position=(" + x + "," + y + "), " + super.toString() + "]";
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
