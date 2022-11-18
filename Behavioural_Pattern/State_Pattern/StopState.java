public class StopState implements State{
    
    public void doAction(Context context)
    {

        System.out.println("Play stopping");

        context.setState(this);


    }

    public String toString()
    {

        return "Stop state";

    }


}
