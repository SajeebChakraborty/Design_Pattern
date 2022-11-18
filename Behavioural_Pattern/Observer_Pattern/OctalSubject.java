public class OctalSubject extends Observer{
    
    public OctalSubject(Subject subject)
    {

        this.subject=subject;
        this.subject.attach(this);



    }

    public void update()
    {

        System.out.println("Octal string " + Integer.toOctalString(subject.getState()));

        
    }


}
