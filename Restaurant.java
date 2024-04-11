/**
 * Classe Restaurant
 * Permet de calculer le prix total d'un repas en fonction des formules et des
 * offres en cours
 */
public class Restaurant {

    /**
     * Calcule le prix total d'un repas en fonction des formules et des offres en
     * cours
     * 
     * @param meal
     * @return le prix total du repas
     */
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

    /**
     * Vérifie si le repas est une formule standard
     * 
     * @param meal
     * @return true si le repas est une formule standard
     */
    private boolean isMealStandardFormula(Meal meal) {
        return meal.drinkSize() == MealDrinkSize.MOYEN && meal.dessertSize() == MealDessertSize.NORMAL;
    }

    /**
     * Vérifie si le repas est une formule max
     * 
     * @param meal
     * @return true si le repas est une formule max
     */
    private boolean isMealMaxFormula(Meal meal) {
        return meal.drinkSize() == MealDrinkSize.GRAND && meal.dessertSize() == MealDessertSize.SPECIAL;
    }

    /**
     * Vérifie si le café est offert avec le repas
     * 
     * @param meal
     * @return true si le café est offert
     */
    private boolean isCoffeeOffered(Meal meal) {
        return meal.type() == MealType.ASSIETTE && isMealStandardFormula(meal) && meal.coffee();
    }
}
