class Department {
    String deptName = "Computer Science";

    void display() {
        System.out.println("Department: " + deptName);
    }

    public static void main(String[] args) {
        Department d = new Department();
        d.display();
    }
}