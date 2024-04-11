public enum MealDrinkSize {
    PETIT(2),
    MOYEN(3),
    GRAND(4);

    private final int price;

    MealDrinkSize(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}