public class ShapeFactory {
    public static Shape getShape(ShapeType shapeType){
        switch (shapeType){
            case ShapeType.CIRCLE:
                return new Circle();
            case ShapeType.SQUARE:
                return new Square();
            case ShapeType.RECTANGLE:
                new Rectangle();
            default:
                System.out.println("Type is invalid");
                return null;
        }

    }
}
