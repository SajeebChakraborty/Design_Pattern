public class StartState implements State{
    
    public void doAction(Context context)
    {

        System.out.println("Play starting");

        context.setState(this);
     

    }

    public String toString()
    {

        return "Start state";

    }


}
