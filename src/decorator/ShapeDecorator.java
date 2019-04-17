package decorator;

public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }
}
