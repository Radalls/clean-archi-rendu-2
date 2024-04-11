public class Restaurant {

    public int calculateTotalBill(Meal meal) {
        int total = 0;

        total += meal.getPrice();

        if (isMealStandardFormula(meal)) {
            System.out.print("Prix Formule Standard appliquée");
            total += 3;
        } else if (isMealMaxFormula(meal)) {
            System.out.print("Prix Formule Max appliquée");
            total = 21;
        }

        if (isCoffeeOffered(meal)) {
            System.out.print(" avec café offert!");
        } else {
            total += meal.coffee() ? 0 : 1;
        }

        return total;
    }

    private boolean isMealStandardFormula(Meal meal) {
        return meal.drinkSize() == MealDrinkSize.MOYEN && meal.dessertSize() == MealDessertSize.NORMAL;
    }

    private boolean isMealMaxFormula(Meal meal) {
        return meal.drinkSize() == MealDrinkSize.GRAND && meal.dessertSize() == MealDessertSize.SPECIAL;
    }

    private boolean isCoffeeOffered(Meal meal) {
        return meal.type() == MealType.ASSIETTE && isMealStandardFormula(meal) && meal.coffee();
    }
}
