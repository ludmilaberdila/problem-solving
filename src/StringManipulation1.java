public class StringManipulation1 {
    public static void main(String[] args) {
    /*  Task 1: Declare a String str1 variable with value "Hello world"
        Write a code that prints out the index of the first occurrence of the word "world"
        in the variable str "Hello world" using the indexOf method.
         Expected output: 6  */
        String str1 = "Hello word";
        System.out.println(str1.indexOf("word"));

     /* Task 2: Declare a variable str2 with value "Hello"
        Write a code that prints the first letter of the str2 using the String method.
        Expected output: H  */
        String str2 = "Hello";
        System.out.println(str2.charAt(0));

      /* Task 3: Declare a variable str3 with value "HELLO"
         Write a code that prints the string str3 in all lowercase using the String method.
         Expected output: hello  */
        String str3 = "HELLO";
        System.out.println(str3.toLowerCase());

      /* Task 4: Declare a variable str4 with value "hello"
        Write a code that prints the string str4 in all uppercase using the String method.
        Expected output: HELLO  */
        String str4 = "hello";
        System.out.println(str4.toUpperCase());

       /* Task 5: Write a code that checks if the strings "hello" and "Hello" are equal or not
        using the equals method, Expected output: false  */
        System.out.println("hello". equals("Hello"));
    }
}
