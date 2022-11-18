public class MainProgram {
    
    public static void main(String args[])
    {

        Shape circle=new Circle();

        circle.draw();

        Shape redCircle=new RedDecorator(new Circle());

        redCircle.draw();

        Shape redRectangle=new RedDecorator(new Rectangular());

        redRectangle.draw();

        



    }


}
