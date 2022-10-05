import Shape.Circle;
import Shape.Rectangle;
import Shape.Shape;
import Shape.Square;



public class Bai1_Bai2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.resize(20);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3,5.4);
        System.out.println(rectangle);
        rectangle.resize(40);
        System.out.println(rectangle);

        System.out.println("___________________________________");
        Circle circle = new Circle(3.6);
        System.out.println(circle);
        circle.resize(30);
        System.out.println(circle);

        System.out.println("___________________________________");
        Square square = new Square(4.6);
        System.out.println(square);
        square.resize(40);
        System.out.println(square);


        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle();
        shapes[1] = new Square(12);
        shapes[2] = new Circle(12);
        System.out.println("_______________________________");
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                System.out.println(((Square) shape).howToColor());
            }
        }

    }
}