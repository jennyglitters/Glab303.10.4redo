public class myRunner {
    public static void main(String[] args) {
        Circle c1 = new Circle(1, 2, 2);
        System.out.println("Area of Circle: " + c1.getArea());
        System.out.println("Coordinates are: " + c1.getCoordinates());
        c1.moveDown();
        System.out.println("After move Down, Coordinates are: " + c1.getCoordinates());
        c1.moveRight();
        System.out.println("After move right, Coordinates are: " + c1.getCoordinates());
        c1.moveUp();
        System.out.println("After move Up, Coordinates are: " + c1.getCoordinates());
        c1.moveLeft();
        System.out.println("After move Left, Coordinates are: " + c1.getCoordinates());

        System.out.println("--------Test Polymorphism-------");
        Movable c2 = new Circle(5, 10, 200);
        c2.moveUp();
        System.out.println("After move up, Coordinates are: " + ((Circle) c2).getCoordinates());
        c2.moveLeft();
        System.out.println("After move Left, Coordinates are: " + ((Circle) c2).getCoordinates());

        Rectangle r1 = new Rectangle(1, 2, 4, 6);
        System.out.println("Area of Rectangle: " + r1.getArea());
        System.out.println("Coordinates are: " + r1.getCoordinates());
        r1.moveDown();
        System.out.println("After move Down, Coordinates are: " + r1.getCoordinates());
        r1.moveRight();
        System.out.println("After move right, Coordinates are: " + r1.getCoordinates());
        r1.moveUp();
        System.out.println("After move Up, Coordinates are: " + r1.getCoordinates());
        r1.moveLeft();
        System.out.println("After move Left, Coordinates are: " + r1.getCoordinates());

        System.out.println("--------Test Polymorphism-------");
        Movable r2 = new Rectangle(5, 10, 7, 3);
        r2.moveUp();
        System.out.println("After move up, Coordinates are: " + ((Rectangle) r2).getCoordinates());
        r2.moveLeft();
        System.out.println("After move Left, Coordinates are: " + ((Rectangle) r2).getCoordinates());

        Triangle t1 = new Triangle(0, 0, 3, 4);
        System.out.println("Area of Triangle: " + t1.getArea());
        System.out.println("Coordinates are: " + t1.getCoordinates());
        t1.moveDown();
        System.out.println("After move Down, Coordinates are: " + t1.getCoordinates());
        t1.moveRight();
        System.out.println("After move right, Coordinates are: " + t1.getCoordinates());
        t1.moveUp();
        System.out.println("After move Up, Coordinates are: " + t1.getCoordinates());
        t1.moveLeft();
        System.out.println("After move Left, Coordinates are: " + t1.getCoordinates());

        System.out.println("--------Test Polymorphism-------");
        Movable t2 = new Triangle(2, 2, 5, 6);
        t2.moveUp();
        System.out.println("After move up, Coordinates are: " + ((Triangle) t2).getCoordinates());
        t2.moveLeft();
        System.out.println("After move Left, Coordinates are: " + ((Triangle) t2).getCoordinates());
    }
}
