public class ProxyImage {
    
    public String fileName;

    public RealImage realImage;

    public ProxyImage(String fileName)
    {

        this.fileName=fileName;


    }

    public void display()
    {

        if(realImage==null)
        {

            realImage=new RealImage(fileName);

        }
        realImage.display(fileName);



    }

}
