package Assignment_1_Day38;

 abstract class Animal {
     String name;
     int age;
     boolean adoptionStatus;

     public Animal(String newName, int newAge, boolean adoptStatus) {
         this.name = newName;
         this.age = newAge;
         this.adoptionStatus = adoptStatus;
     }

     public void displayAnimalInfo() {
         System.out.println(this.getClass().getSimpleName() + " by name: " + name +
                 "\nAge: " + age +
                 "\nAdoption Status: " + adoptionStatus);
     }
 }

