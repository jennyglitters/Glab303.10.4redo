public class Circle extends Shape implements Movable {
    protected double radius;
    private int x, y;
    private static final double PI = Math.PI;

    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double height) {
        this.radius = radius;
        super.height = height;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(this.radius, 2);
    }

    @Override
    public void displayShapeName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }

    @Override
    public String toString() {
        return "Circle[ radius = " + radius + ", " + super.toString() + " ]";
    }

    @Override
    public String getCoordinates() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public void moveUp() {
        y--; // Move up decreases y
    }

    @Override
    public void moveDown() {
        y++; // Move down increases y
    }

    @Override
    public void moveLeft() {
        x--; // Move left decreases x
    }

    @Override
    public void moveRight() {
        x++; // Move right increases x
    }
}