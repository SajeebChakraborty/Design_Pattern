public abstract class AbstractLogger 
{

    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    protected int level;

    protected AbstractLogger nextlogger;

    public void setNextlogger(AbstractLogger nexLogger)
    {

        this.nextlogger=nexLogger;

    }

    public void logmessage(int level,String message)
    {

        if(this.level <= level)
        {

            write(message);


        }
        
        if(nextlogger!=null)
        {

            nextlogger.logmessage(level, message);;

        }


    }

    protected abstract void write(String message);


}