package Assignment_1_Day38;

 abstract class Animal {
     String name;
     int age;
     boolean adoptionStatus;

     public Animal(String name, int age, boolean adoptionStatus) {
         this.name = name;
         this.age = age;
         this.adoptionStatus = adoptionStatus;
     }

     public void displayAnimalInfo() {
         System.out.println("Name: " + name +
                 "\nAge: " + age +
                 "\nAdoption Status: " + adoptionStatus);
     }
 }

