package decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("decorator.Circle with normal border");
        circle.draw();
        System.out.println();

        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("decorator.Circle of red border");
        redCircle.draw();
        System.out.println();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("decorator.Rectangle of red border");
        redRectangle.draw();
    }
}
