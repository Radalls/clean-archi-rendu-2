public class MealBuilder {

    private static MealBuilder instance = null;

    public static MealBuilder getInstance() {
        if (instance == null) {
            instance = new MealBuilder();
        }
        return instance;
    }

    private MealBuilder() {
    }

    public static Meal buildMealFromArgs(
            String mealType, String mealName, String drinkName, String drinkSize,
            String dessertName, String dessertSize, String coffee) {
        try {
            MealType type = MealType.valueOf(mealType.toUpperCase());
            MealDrinkSize size = MealDrinkSize.valueOf(drinkSize.toUpperCase());
            MealDessertSize dessert = MealDessertSize.valueOf(dessertSize.toUpperCase());
            boolean coffeeBoolean = coffee.equalsIgnoreCase("yes");

            return new Meal(type, mealName, drinkName, size, dessertName, dessert, coffeeBoolean);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid arguments for meal creation");
            System.exit(1);
        }

        return null;
    }
}