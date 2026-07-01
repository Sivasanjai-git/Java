class CollegeManagement {
    String collegeName;
    String department;

    void display() {
        System.out.println("College: " + collegeName);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        CollegeManagement c = new CollegeManagement();
        c.collegeName = "ABC College";
        c.department = "Computer Science";
        c.display();
    }
}
