public class FacadePatternDemo {
    
    public static void main(String args[])
    {

        ShapeFactory shape = new ShapeFactory();

        shape.drawCircle();
        shape.drawRectangle();
        shape.drawSquare();


    }

}
