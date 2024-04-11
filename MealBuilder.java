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

    /**
     * Construit un repas à partir des arguments passés en paramètre au lancement du
     * programme
     * 
     * @param mealType    assiette ou sandwich
     * @param mealName    nom du repas
     * @param drinkName   nom de la boisson
     * @param drinkSize   taille de la boisson
     * @param dessertName nom du dessert
     * @param dessertSize taille du dessert
     * @param coffee      café pris avec le repas ou non
     * @return le repas construit à partir des arguments
     */
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