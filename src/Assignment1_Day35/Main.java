package Assignment1_Day35;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.makeSound();
        animal.animalSoundTest(dog);
        animal.animalSoundTest(cat);

    }
}
