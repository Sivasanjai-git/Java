class Encapsulation {
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setName("Siva");
        System.out.println(e.getName());
    }
}