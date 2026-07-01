class College {
    String name = "ABC Engineering College";

    void display() {
        System.out.println("College Name: " + name);
    }

    public static void main(String[] args) {
        College c = new College();
        c.display();
    }
}