public class Main {
    public static void main(String[] args) {
        ShapeFactory myFactory = new ShapeFactory();
        IShape myCircle = myFactory.createShape("Circle");
        IShape myTriangle = myFactory.createShape("Triangle");

        myCircle.draw();
        myTriangle.draw();
    }
}