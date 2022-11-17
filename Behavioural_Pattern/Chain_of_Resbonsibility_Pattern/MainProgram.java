public class MainProgram {
    
    public static AbstractLogger getChain()
    {

        AbstractLogger errorlogger=new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger filelogger=new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consolelogger=new ConsoleLogger(AbstractLogger.INFO);

        errorlogger.setNextlogger(filelogger);
        filelogger.setNextlogger(consolelogger);

        return errorlogger;


    }

    public static void main(String args[])
    {

        AbstractLogger getChain=getChain();

        getChain.logmessage(AbstractLogger.INFO, "This is information");
        getChain.logmessage(AbstractLogger.DEBUG, "This is debug");
        getChain.logmessage(AbstractLogger.ERROR, "This is error");


    }



}
