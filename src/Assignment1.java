import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        /* 1) Write a class that accepts a first and last name from the keyboard
          one person, and then the name and surname of another.
          The class should check if these two people are:
          First you need to enter first and last name for one person, then for another.
        *Check if they have the same first and last names and print relevant text.
        * Check if they have same first names, but not last names and print relevant text.
        * Check if they have the same last names but not first names and print relevant text  */
        Scanner scanner = new Scanner(System.in);
//        //first person
//        System.out.println("Person number One, Enter your First Name: ");
//        String firstName1 = scanner.nextLine();
//        System.out.println("Enter your Last Name");
//        String lastName1 = scanner.nextLine();
////second person
//        System.out.println("Person number tow, Enter your First Name: ");
//        String firstName2 = scanner.nextLine();
//        System.out.println("Enter your Last Name");
//        String lastName2 = scanner.nextLine();
//        if (firstName1.equalsIgnoreCase (firstName2) && lastName1.equalsIgnoreCase(lastName2)){
//        System.out.println("Both person have the same first and last name!");
//    } else if (firstName1.equalsIgnoreCase(firstName2)) {
//            System.out.println("Both person have the same first!");
//        }
//        else if (lastName1.equalsIgnoreCase(lastName2)) {
//            System.out.println("Both person have the same last name!");
//        }
//    else {
//            System.out.println("Both person have different first and last name!");}


      /*  2)  Write a program that asks user for their salary and year of service and print the net bonus amount.
        A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
        Input: 10000
        Input: 9
        Output: 10500 */
//        System.out.println("Enter your salary :");
//        double salary = scanner.nextDouble();
//        System.out.println("Enter years of service");
//        int years = scanner.nextInt();
//        double bonus = 0;
//        if (years >=5) {
//            bonus = 0.05 * salary;
//
//            // Print the net bonus amount
//            System.out.println("Salary " + salary + " after a 5% bonus total is : $" + (salary + bonus));
//        }else{
//        System.out.println("Net bonus amount: $" + bonus + (" No bonus applied!")); }


      /*  3) Write a program to check if a year is leap year or not.
           If a year is divisible by 4 then it is leap year but
           if the year is century year like 2000, 1900, 2100 then it must be divisible by 400. */
           System.out.print("Enter a year: ");
           int year = scanner.nextInt();
        // Check if the year is a leap year,
        // if some year is centery then it should be divisible by 400
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0)) {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year."); }


     /*   Ask user to enter age, gender ( M or F ) and then using
         following rules print their place of service.
        if employee is female, then she will work only in urban areas.
        if employee is a male and age is in between 20 to 40 then he may work in anywhere
        if employee is male and age is in between 40 to 60 then he will work in urban areas only. */
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//        System.out.print("Enter your gender (M or F): ");
//        char gender = scanner.next().charAt(0);
//        String placeOfService;
//        if (gender == 'F' || (gender == 'M' && age >= 40 && age <= 60)) {
//            placeOfService = "Urban Areas";
//        } else if (gender == 'M' && age >= 20 && age <= 40) {
//            placeOfService = "Anywhere";
//        } else {
//            placeOfService = "Not specified";
//        }
//        System.out.println("Place of service: " + placeOfService); }


/*5) Write a program that asks user to enter boolean talking, int hour
      Imagine that if talking is true that means that parrot is talking
       and hour 22 means : Parrot is talking at 10PM
       * hours can be from 0 - 23
       * We are in trouble if the parrot is talking and the hour is before 7 or after 20
         return true
       * If at least talking is false and hour is between 7 and 20 then we are not in trouble
       Input: true
       Input: 6
       Output: We are in trouble
       Input: true
       Input: 7
       Output: We are not in trouble
       Input: false
       Input: 5
       Output: We are not in trouble */
        System.out.println("Is the parrot talking? true/false): ");
        boolean talking = scanner.nextBoolean();
        System.out.println("Enter the hour (0 - 23): ");
        int hour = scanner.nextInt();
        boolean inTrouble;
        if (talking && (hour < 7 || hour > 20)) {
            inTrouble = true;
        } else {
            inTrouble = false;
        }
        if (inTrouble) {
            System.out.println("We are in trouble!");
        } else {
            System.out.println("We are not in trouble.");
        }

    }

}


