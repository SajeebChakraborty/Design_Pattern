import java.util.ArrayList;
import java.util.List;

public class Broker {
    
    public List<Order> orderlist = new ArrayList<Order>();

    public void takeOrder(Order order)
    {

        orderlist.add(order);

    }

    public void placeOrder()
    {

        for(Order order : orderlist)
        {

            order.execute();

        }

        orderlist.clear();

    }


}
