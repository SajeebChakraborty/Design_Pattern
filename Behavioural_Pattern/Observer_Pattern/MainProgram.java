public class MainProgram {
    
    public static void main(String[] args)
    {

        Subject subject=new Subject();

        new HexaSubject(subject);
        new OctalSubject(subject);
        new BinarySubject(subject);

        subject.setState(10);

        subject.setState(15);

        


    }


}
