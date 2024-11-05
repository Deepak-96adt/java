// Calculate the area of a circle.

class Circle {

    static final double PI = 3.14159;

    public double calculateAreaOfCircle(double radius) {
        return (Circle.PI * (radius * radius));
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        double radius = 4.3; // Example radius
        System.out.println("Area of circle: " + circle.calculateAreaOfCircle(radius));
    }
}
