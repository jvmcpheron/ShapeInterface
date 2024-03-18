public class Main {
    public static void main(String[] args) {
        ShapeFactory myFactory = new ShapeFactory();
        IShape myCircle = myFactory.createShape("Circle");
        IShape myTriangle = myFactory.createShape("Triangle");
        IShape myStar = myFactory.createShape("Star");

        myCircle.draw();
        myTriangle.draw();
        myStar.draw();
    }
}