public class MealBuilder {
    
    public Meal vegMeal()
    {

        Meal meal = new Meal();

        meal.addItem(new VegBurger());

        meal.addItem(new Coke());

        return meal;

        
    }

    public Meal nonVegMeal()
    {

        Meal meal = new Meal();

        meal.addItem(new ChickenBurger());

        meal.addItem(new Pepsi());

        return meal;

        
    }

}
