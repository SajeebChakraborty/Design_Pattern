public class MainProgram {
    
    public static void main(String args[])
    {

        Shape redcircle = new Circle(5,10,5,new RedCircle());

        Shape greenircle = new Circle(5,10,1,new GreenCircle());

        redcircle.draw();

        greenircle.draw();


    }


}
