/**
 * Contient les informations d'un repas commandé.
 */
public record Meal(
        MealType type,
        String mealName,
        String drinkName,
        MealDrinkSize drinkSize,
        String dessertName,
        MealDessertSize dessertSize,
        boolean coffee) {

    /**
     * Calcule le prix du repas
     * 
     * @return le prix du repas
     */
    public int getPrice() {
        int price = 0;
        switch (type) {
            case ASSIETTE -> price += 10;
            case SANDWICH -> price += 5;
        }

        price += drinkSize.getPrice();
        price += dessertSize.getPrice();

        if (coffee) {
            price += 2;
        }

        return price;
    }
}