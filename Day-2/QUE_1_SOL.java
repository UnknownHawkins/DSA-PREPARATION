class Circle {
    int radius;
    void CalculateArea() {
        System.out.println("Area Of Circle" + (3.14 * radius * radius));
    }
    void CalculatePerimeter() {
        System.out.println("Perimeter Of Circle" + (2 * 3.14 * radius));
    }
}
public class QUE_1_SOL {
    public static void main(String[] args) {
        Circle C1 = new Circle();
        C1.radius = 10;
        C1.CalculateArea();
        C1.CalculatePerimeter();
    }
}
