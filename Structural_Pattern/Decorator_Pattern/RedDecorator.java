public class RedDecorator extends Decorator{

    public RedDecorator(Shape decoratorShape) {

        super(decoratorShape);


    }
    
    public void draw()
    {

        setRedBorder(decoratotShape);


    }

    public void setRedBorder(Shape decoratorShape)
    {

        decoratorShape.draw();
        System.out.println("red color Border");


    }
    


}
