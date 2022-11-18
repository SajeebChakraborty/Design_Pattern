public class Decorator implements Shape{
    
    protected Shape decoratotShape;

    public Decorator(Shape decoratorShape)
    {

        this.decoratotShape=decoratorShape;


    }

    public void draw()
    {

        decoratotShape.draw();

    }


}
