public class Main {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // args[0] = type de repas
        // args[1] = nom du repas
        // args[2] = nom de la boisson
        // args[3] = taille de la boisson
        // args[4] = nom du dessert
        // args[5] = taille du dessert
        // args[6] = café pris avec le repas ou non
        Meal meal = MealBuilder.buildMealFromArgs(args[0], args[1], args[2], args[3], args[4], args[5], args[6]);

        System.out.println("\nPrix à payer : " + restaurant.calculateTotalBill(meal) + " euros");
    }
}