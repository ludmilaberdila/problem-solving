package Assignment_1_Day38;

import java.util.ArrayList;

class AnimalRescueCenter {
    ArrayList<Animal> rescuedAnimals = new ArrayList<Animal>();

    public void addAnimal(Animal animal){
        rescuedAnimals.add(animal);
    }

    public void listAnimals(){
        if(!rescuedAnimals.isEmpty()){
            System.out.println("=====================");
            for (Animal animal: rescuedAnimals){
                animal.displayAnimalInfo();
            }
            System.out.println("=====================");
        }else{
            System.out.println("Currently we don't have any animals in our shelter");
        }

    }

    public void listAnimalsByType(String type){
        String className;
        boolean animalExists = false;
        System.out.println("=====================");
        for (Animal animal: rescuedAnimals){
            className = animal.getClass().getSimpleName().toLowerCase();
            if(type.toLowerCase().equals(className)){
                animal.displayAnimalInfo();
                animalExists = true;
            }
        }
        System.out.println("=====================");
        if(!animalExists){
            System.out.println("Sorry, no \"" + type + "\" animal in our shelter");
        }
    }

    public void updateAdoptionStatus(String name, boolean adoptionStatus){
        boolean animalUpdated = false;
        String animalType = "";
        String adopted = "adopted, yaaaay!";
        if(!adoptionStatus){
            adopted = "not adopted, sorry.";
        }
        for (Animal animal: rescuedAnimals){
            if(animal.name.toLowerCase().equals(name.toLowerCase())){
                animal.adoptionStatus = adoptionStatus;
                animalUpdated = true;
                animalType = animal.getClass().getSimpleName();
            }
        }
        if(animalUpdated){
            System.out.println(animalType + " by name \"" + name +
                    "\" updated adoption status: " + adopted);
        }else {
            System.out.println("No such animal by name \"" + name + "\" in our shelter.");
        }
    }
}
