class House {
    String color = "White";

    void display() {
        System.out.println("House Color: " + color);
    }

    public static void main(String[] args) {
        House h = new House();
        h.display();
    }
}