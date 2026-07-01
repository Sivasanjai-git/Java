class FoodDelivery {
    String food = "Pizza";

    void order() {
        System.out.println("Ordered: " + food);
    }

    public static void main(String[] args) {
        FoodDelivery f = new FoodDelivery();
        f.order();
    }
}