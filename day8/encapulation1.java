class Encapsulation1 {
    private int age;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Encapsulation1 e = new Encapsulation1();
        e.setAge(20);
        System.out.println("Age: " + e.getAge());
    }
}