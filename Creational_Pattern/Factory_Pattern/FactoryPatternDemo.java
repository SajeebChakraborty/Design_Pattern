

public class FactoryPatternDemo {
    
    public static void main(String args[])
    {

        ShapeFactory object = new ShapeFactory();

        Shape shape1=object.getShape("Circle");

        shape1.draw();

        Shape shape2=object.getShape("Rectangle");

        shape2.draw();

        Shape shape3=object.getShape("Square");

        shape3.draw();




    }


}
