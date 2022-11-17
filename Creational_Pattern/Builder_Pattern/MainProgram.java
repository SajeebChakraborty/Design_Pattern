public class MainProgram {
    
    public static void main(String[] args)
    {


        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.vegMeal();
        System.out.println("Veg Meal");
        vegMeal.itemList();
        System.out.println("Total Cost: " + vegMeal.totalCost());

        Meal nonVegMeal = mealBuilder.nonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.itemList();
        System.out.println("Total Cost: " + nonVegMeal.totalCost());

    }


}
