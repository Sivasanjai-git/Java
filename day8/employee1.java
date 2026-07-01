class Employee1 {
    int id;
    String name;

    Employee1(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Employee1 e = new Employee1(102, "Anu");
        e.display();
    }
}