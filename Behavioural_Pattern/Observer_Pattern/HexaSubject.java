public class HexaSubject extends Observer{


    public HexaSubject(Subject subject)
    {

        this.subject=subject;

        this.subject.attach(this);


    }

    public void update()
    {

        System.out.println("Hex String " + Integer.toHexString(subject.getState()));

        
    }

}
