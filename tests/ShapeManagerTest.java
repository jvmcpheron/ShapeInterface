import org.junit.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeManagerTest {
   @Test
    public void test_JUnit() {
        ShapeManager myManager = new ShapeManager();
        myManager.addShape("Circle");
        myManager.addShape("Circle");
        myManager.addShape("Triangle");
        myManager.addShape("Star");

        Vector<IShape> myShapes = myManager.getAllShapes();


        assertTrue(myShapes.get(0) instanceof Circle);
        assertTrue(myShapes.get(1) instanceof Circle);
        assertTrue(myShapes.get(2) instanceof Triangle);
        assertTrue(myShapes.get(3) instanceof Star);
    }
}