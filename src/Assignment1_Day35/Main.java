package Assignment1_Day35;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Dog dog = new Dog(); //instace
        Cat cat = new Cat();

        animal.animalSoundTest(dog);
        animal.animalSoundTest(cat);

    }
}
