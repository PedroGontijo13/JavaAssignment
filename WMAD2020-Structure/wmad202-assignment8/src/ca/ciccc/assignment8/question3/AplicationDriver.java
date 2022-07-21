package ca.ciccc.assignment8.question3;
import ca.ciccc.assignment8.question2.Shape;

public class AplicationDriver {
    enum ShapeType {
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom;

        public enum Custom {}
    }

    class MyGeometry {
        public void calculateAreaAndPerimeter(Shape shape, int[] slSides) {
            if(!ShapeType.Custom.class.isInstance(shape)) {
                shape.perimeter();
                shape.area();
            } else {
                shape.perimeter();
            }
        }
    }

    public void main(String[] args) {
        MyGeometry mg = new MyGeometry();
        int[] slSides = {10, 20};
        ShapeType s1Type = ShapeType.Rectangle;
        int[] slSides2 = {10};
        ShapeType s2Type = ShapeType.Square;
        int[] slSides3 = {12};
        ShapeType s3Type = ShapeType.Circle;
        int[] slSides4 = {8, 12, 12};
        ShapeType s4Type = ShapeType.Custom;
    }
}
