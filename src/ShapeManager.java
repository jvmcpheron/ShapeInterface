import java.util.Vector;

public class ShapeManager {
    private Vector<IShape> myShapes = new Vector<>();
    private ShapeFactory myFactory = new ShapeFactory();

    public void addShape(String shapeType){
        myShapes.add(myFactory.createShape(shapeType));
    }

    public Vector<IShape> getAllShapes(){
        return myShapes;
    }


}
