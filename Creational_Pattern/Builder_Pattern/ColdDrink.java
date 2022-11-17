public abstract class ColdDrink implements Item{
    
    public Packing pack()
    {

        return new Bottle();

    }

    public abstract float price();


}
