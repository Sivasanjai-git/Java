class Car {
    String brand;
    String model;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Toyota";
        c.model = "Innova";
        c.display();
    }
}