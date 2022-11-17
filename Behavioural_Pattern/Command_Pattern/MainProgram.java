public class MainProgram {
    
    public static void main(String[] args)
    {

        Stock abcStock = new Stock();

        BuyStock buyabcStock = new BuyStock(abcStock);
        
        SellStock sellabcStock = new SellStock(abcStock);

        Broker broker = new Broker();

        broker.takeOrder(buyabcStock);
        broker.takeOrder(sellabcStock);

        broker.placeOrder();



    }

}
