package module05.shapes;

public abstract class Shape {
    protected String shapeName;

    protected Shape(String shape) {
        shapeName = shape;
    }

    public abstract double area();

    public String toString() {
        return shapeName;
    }
}