public class SellStock implements Order{
    
    Stock abcStock=new Stock();

    public SellStock(Stock abcStock)
    {

        this.abcStock=abcStock;

    }
    
    public void execute()
    {

        abcStock.sell();

    }

}
