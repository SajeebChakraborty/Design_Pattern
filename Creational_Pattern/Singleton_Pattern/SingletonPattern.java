public class SingletonPattern
{

    private static SingletonPattern instance = new SingletonPattern();
    

    private SingletonPattern()
    {

    }

    
    public static SingletonPattern getInstance()
    {

        return instance;

    }

    public void msg()
    {

        System.out.println("It is Singleton Pattern");

    }



}