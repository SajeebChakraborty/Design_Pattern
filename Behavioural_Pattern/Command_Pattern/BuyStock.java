public class BuyStock implements Order{

    Stock abcStock = new Stock();
    
    public BuyStock(Stock abcStock)
    {

        this.abcStock=abcStock;

    }

    
    public void execute()
    {

        abcStock.buy();

    }

}
