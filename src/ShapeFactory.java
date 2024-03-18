public class ShapeFactory {
    IShape createShape(String shapeType){
        if(shapeType.equals("Circle")){
            return new Circle();
        }else if(shapeType.equals("Triangle")){
            return new Triangle();
        }else if(shapeType.equals("Star")){
            return new Star();
        }
        return null;
    }
}
