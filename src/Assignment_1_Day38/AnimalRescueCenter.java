package Assignment_1_Day38;

import java.util.ArrayList;

class AnimalRescueCenter {
    ArrayList<Animal> rescuedAnimals = new ArrayList<Animal>();

    public void addAnimal(Animal animal){
        rescuedAnimals.add(animal);
    }

    public void listAnimals(){
        for (Animal animal: rescuedAnimals){
            animal.displayAnimalInfo();
        }
    }

    public void listAnimalsByType(String type){
        for (Animal animal: rescuedAnimals){
            animal.displayAnimalInfo();
            if(animal instanceof )
        }
    }
//    Display a list of rescued animals based on their type
//            (Dog, Cat, or Bird) using loops and (if or switch statements)
//    TODO: updateAdoptionStatus(String name, boolean adoptionStatus):
//    Update the adoption status of an animal using loops by name.


//    TODO: Create a Main class with the main method,
//    TODO: use a Scanner to allow the user to input animal data,
//    TODO: create an object of AnimalsRescueCenter,
//    TODO: use while loop and conditional statements to
//      add animal,
//      list all animals,
//      list animals by type,
//      update adoption status
//      exit.
}
