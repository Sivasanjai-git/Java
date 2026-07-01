class Car1 {
    String brand;
    String model;

    Car1(String b, String m) {
        brand = b;
        model = m;
    }

    void display() {
        System.out.println(brand + " " + model);
    }

    public static void main(String[] args) {
        Car1 c = new Car1("Hyundai", "Creta");
        c.display();
    }
}