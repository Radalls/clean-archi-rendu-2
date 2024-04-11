public class Restaurant {

    public int calculateTotalBill(Meal meal) {
        int total = 0;

        total += meal.getPrice();

        if (meal.drinkSize() == MealDrinkSize.MOYEN && meal.dessertSize() == MealDessertSize.NORMAL) {
            System.out.print("Prix Formule Standard appliquée");
            total += 3;
        } else if (meal.drinkSize() == MealDrinkSize.GRAND && meal.dessertSize() == MealDessertSize.SPECIAL) {
            System.out.print("Prix Formule Max appliquée");
            total = 21;
        }

        if (meal.type() == MealType.ASSIETTE && meal.drinkSize() == MealDrinkSize.MOYEN
                && meal.dessertSize() == MealDessertSize.NORMAL && meal.coffee()) {
            System.out.print(" avec café offert!");
        } else {
            total += meal.coffee() ? 0 : 1;
        }

        return total;
    }
}
