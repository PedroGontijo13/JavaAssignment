package ca.ciccc.assignment8.question2;

public abstract class Shape {
    private String Type;
    public Shape(ApplicationDriver.ShapeType rectangle, int[] slSides) {
        Type = String.valueOf(rectangle);
    }

    public abstract float perimeter();
    public abstract float area();
}
