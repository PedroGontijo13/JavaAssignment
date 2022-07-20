package ca.ciccc.assignment8.question2;

abstract class Shape {
    private int n1;
    private int n2;
    private int n3;
    private String Type;
    public Shape(ApplicationDriver.ShapeType rectangle, int[] slSides) {
        Type = String.valueOf(rectangle);
        n1 = slSides[0];
        n2 = slSides[1];
        n3 = slSides[2];
    }

    abstract float perimeter();
    abstract float area();
}
