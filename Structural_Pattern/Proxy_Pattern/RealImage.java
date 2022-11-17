public class RealImage {

    public String fileName;

    public RealImage(String fileName)
    {

        this.fileName=fileName;

        loadFromDisk(fileName);


    }

    public void display(String fileName)
    {

        System.out.println("Display Image from cpu ...");

    }

    public void loadFromDisk(String fileName)
    {

        System.out.println("Load from disking ... "+fileName);

    }


}
