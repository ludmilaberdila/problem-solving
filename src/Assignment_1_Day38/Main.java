package Assignment_1_Day38;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        AnimalRescueCenter shelter = new AnimalRescueCenter();
        String userInput;
        boolean flagLoop = true;
        int animalAge;
        boolean adoptStatus;
        String animalType;
        while (flagLoop){
            System.out.println("""
                Welcome to the Animal Rescue Center!
                1. Add animals
                2. List all animals
                3. List animals by type
                4. Update Adoptions status
                5. Exit""");
            userInput = scanner.nextLine();
            switch(userInput) {
                case "1":
                    System.out.println("What type of animal you want to add: ");
                    String animalToAdd = scanner.nextLine();
                    System.out.println("Enter name: ");
                    String animalName = scanner.nextLine();
                    System.out.println("Enter age: ");
                    animalAge = scanner.nextInt();
                    System.out.println("Enter adoptionStatus: ");
                    adoptStatus = scanner.nextBoolean();
                    Animal newAnimal = null;
                    if(animalToAdd.toLowerCase().equals("dog")){
                        newAnimal = new Dog(animalName, animalAge, adoptStatus);
                    } else if (animalToAdd.toLowerCase().equals("cat")) {
                        newAnimal = new Cat(animalName, animalAge, adoptStatus);
                    } else if (animalToAdd.toLowerCase().equals("bird")) {
                        newAnimal = new Bird(animalName, animalAge, adoptStatus);
                    }else {
                        System.out.println("Sorry our shelter doesn't accept " + animalToAdd + "'s yet.");
                    }
                    if(newAnimal != null){
                        shelter.addAnimal(newAnimal);
                    }
                    scanner.nextLine(); // clear scanner
                    break;
                case "2":
                    shelter.listAnimals();
                    break;
                case "3":
                    System.out.println("What type of animals you want to list: ");
                    animalType = scanner.nextLine();
                    shelter.listAnimalsByType(animalType);
                    break;
                case "4":
                    System.out.println("Enter the name of animal you want to update: ");
                    animalName = scanner.nextLine();
                    System.out.println("Enter adoption status to change to: ");
                    adoptStatus = scanner.nextBoolean();
                    shelter.updateAdoptionStatus(animalName, adoptStatus);
                    scanner.nextLine(); // clear scanner
                    break;
                case "5":
                    flagLoop = false;
                    System.out.println("Exit out of the shelter");
                    break;
                default:
                    System.out.println("Incorrect option selected");
            }
            System.out.println("----------------------------------------");
        }
    }
}
