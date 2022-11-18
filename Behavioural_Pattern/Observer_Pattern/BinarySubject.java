public class BinarySubject extends Observer{
    
    public BinarySubject(Subject subject)
    {

        this.subject=subject;
        this.subject.attach(this);


    }

    public void update()
    {

        System.out.println("Binary string " + Integer.toBinaryString(subject.getState()));


    }


}
