public class StringManipulation3 {
    public static void main(String[] args) {
       /* 1. Declare a variable String kitten, take the first 2 chars and print
       the string with the 2 chars added at both the front and back,
       so "kitten" becomes "kikittenki". Output: kikittenki  */
        String kitten = "kitten";
        System.out.println(kitten.substring(0, 2) +  kitten + kitten.substring(0, 2));

       /* 2. Check if a given String contains a specific character
        String str1 = "Hello, Universe!";
        char ch = 'o';
        Expected result: true */
        String str1 = "Hello, Universe!";
        char ch = 'o';
        System.out.println(str1.indexOf(ch) >= 0);

        /*3. Extract a substring from a given String:
            String str2 = "Hello, World!";
            int start = 7; int end = 10;
            Expected result: Wor */
        String str2 = "Hello, World!";
        int start = 7; int end = 10;
        System.out.println(str2.substring(start, end));

       /* 4. Using charAt() method extract letter 'W' and print it
        String str3 = "Good morning World";
        Expected result: W, index =13 */
        String str3 = "Good morning World";
        System.out.println("W, index = " + str3.indexOf('W'));

       /* 5. Remove extra white spaces from both ends
        String str4 = "         I love coding     "
        Expected result: "I love coding" */
        String str4 = "         I love coding     ";
        System.out.println("\"" + str4.trim() + "\"");

       /*6. Remove all occurrences of letter 'o' and spaces in the below String
        String str5 = "Learn as if you will live forever, live like you will die tomorrow";
        Expected result: Learnasifyuwilllivefrever,livelikeyuwilldietmrrw  */
        String str5 = "Learn as if you will live forever, live like you will die tomorrow";
        System.out.println(str5.replaceAll("o", "").replaceAll(" ", ""));


      /*7. Write a program that asks user to enter a Stringzz
        print a new string where the first and last chars have been exchanged.
        And your first letters always must be upper case and last lower case.
        Input: California
        Output: Aalifornic  */
        String b1 = "California";
        System.out.print(b1.toUpperCase().charAt(9));
        System.out.print(b1.toLowerCase().charAt(8));
        System.out.print(b1.toLowerCase().charAt(7));
        System.out.print(b1.toLowerCase().charAt(6));
        System.out.print(b1.toLowerCase().charAt(5));
        System.out.print(b1.toLowerCase().charAt(4));
        System.out.print(b1.toLowerCase().charAt(3));
        System.out.print(b1.toLowerCase().charAt(2));
        System.out.print(b1.toLowerCase().charAt(1));
        System.out.print(b1.toLowerCase().charAt(0));





    }
}
