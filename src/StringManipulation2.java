public class StringManipulation2 {
    public static void main(String[] args) {
        /*1. Write a code that concatenates the strings "Hello" and "World"
        using the concat method and prints the resulting string. Expected output: HelloWorld  */
        String a1 = "Hello";
        String a2 = "World";
        System.out.println("Hello" + "World");

       /* 2. Write a code that checks if the strings "hello" and "HELLO" are equal
       ignoring case and prints out the result.  Expected output: true  */
        String b1 = "hello";
        String b2 = "HELLO";
        System.out.println(b1.equalsIgnoreCase(b2));

      /* 3. Write a code that prints the length of the string "Hello World" using the String method.
          Expected output: 11  */
         String str = "Hello World";
        System.out.println(str.length());

       /* 4. Write a code that prints the third character of the string "Hello" using the String
           method.  Expected output: l   */
        System.out.println(a1.charAt(2));

       /*5.  Declare String sentence variable with value "Hello World"
        Write a code that replaces all occurrences of the letter "l" with the letter "r" in the string
        sentence and print changed String. Expected output: Herro worrd   */
        System.out.println(str.replaceAll("l", "r"));

    }
}
