class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

public class AnimalArray {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Animal();
        animals[1] = new Animal();
        animals[2] = new Animal();

        for (Animal a : animals) {
            a.sound();
        }
    }
}