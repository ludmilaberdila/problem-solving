import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
   /* 1. Write a program that asks user to enter 2 variables login and password
    * if login and password are correct then print "Successful login!"
        otherwise print "Some credential is wrong!"
        Correct credentials: login = codewise22, password = password112
        Input: codewise22
        Input: password112
        Output: Successful login! */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your login: ");
//        String login = scanner.nextLine();
//        System.out.print("Enter your password: ");
//        String password = scanner.nextLine();
//        if (login.equals("codewise22") && password.equals("password112")) {
//            System.out.println("Successful login!");
//        } else {
//            System.out.println("Some credential is wrong!");
//        }


    /* 2. Print age stage like toddler, teen and other by checking age
     between 1 and 3 toddler inclusive
     between 4 and 5 preschool inclusive
     between 6 and 12 gradeschooler inclusive
     between 13 and 17 teen inclusive
     between 18 to .. adult inclusive
     age is greater 135 -> Wrong age
        Input: 23
        Output: adult  */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//        String ageStage;
//        if (age >= 1 && age <= 3) {
//            ageStage = "Toddler";
//        } else if (age >= 4 && age <= 5) {
//            ageStage = "Preschooler";
//        } else if (age >= 6 && age <= 12) {
//            ageStage = "Gradeschooler";
//        } else if (age >= 13 && age <= 17) {
//            ageStage = "Teen";
//        } else if (age >= 18  && age == 135) {
//            ageStage = "Adult";
//        } else {
//            ageStage = "Wrong age";
//        }
//        System.out.println("Age stage: " + ageStage); }


     /*   3) Write a program that asks user to enter password
             and checks whether it follows rules and its level
                * password must have at least 4 letters
                * password must contain !
                * if password has 4 or more letters its 1st level password
                * if password has 6 or more letters its 2nd level password
                * if password has 10 or more letters its 3rd level password
        Input: pass
        Output: Your password doesn't contain "!"
        Input: 12
        Output:
        Your password is too short!
        Your password doesn't contain "!"
        Input: password!
         Output: 2nd level password   */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if(password.length() < 4){
            System.out.println("Your password is too short !");
        }
        if(password.indexOf('!') < 0){
            System.out.println ("Your password doesn't contain \"!\"");
        }
        if(password.length() >= 10){
            System.out.println("3nd level password");
        } else if (password.length() >= 6) {
            System.out.println("2nd level password");
        } else if (password.length() >= 4) {
            System.out.println("1st level password");
        }
    }
}