public class Main {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Meal meal = MealBuilder.buildMealFromArgs(args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
        System.out.println("\nPrix à payer : " + restaurant.calculateTotalBill(meal) + " euros");
    }
}