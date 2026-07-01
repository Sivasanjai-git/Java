class Laptop {
    String brand;
    int ram;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
    }

    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.brand = "Dell";
        l.ram = 8;
        l.display();
    }
}