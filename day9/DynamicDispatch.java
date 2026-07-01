class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat Meows");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();
    }
}