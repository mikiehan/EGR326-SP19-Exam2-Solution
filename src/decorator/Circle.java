package decorator;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("decorator.Shape: decorator.Circle");
    }
}
