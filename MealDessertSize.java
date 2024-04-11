public enum MealDessertSize {
    NORMAL(2),
    SPECIAL(4);

    private final int price;

    MealDessertSize(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}