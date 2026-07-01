class Employee {
    int id;
    String name;
    double salary;

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.id = 101;
        e.name = "Rahul";
        e.salary = 30000;
        e.display();
    }
}