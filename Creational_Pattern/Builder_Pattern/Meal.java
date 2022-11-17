import java.util.ArrayList;
import java.util.List;


public class Meal {
    
    private List<Item> items=new ArrayList<Item>();

    public void addItem(Item item)
    {

        items.add(item);

    }

    public void itemList()
    {

        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.pack().pack());
            System.out.println(", Price : " + item.price());
         }	

    }

    public float totalCost()
    {

        var total=0.0f;

        for(Item item : items)
        {


            total=total + item.price();            


        }

        return total;


    }
    

}
