public class StringCompring {
    public static void main(String[] args) {

      /* Task 1: write a program that compares values of hello1 and hello2, and print the result
         Expected output: false */
        String hello1 = "Hello World!";
        String hello2 = "Hello world!";
        String hello3 = new String("Hello World!");
        System.out.println(hello1.equals(hello2));

      /* Task 2: write a program that compares references of hello1 and hello3, and print the result
      Expected output: false */
        System.out.println(hello1 == hello3);

      /*Task 3: write a program that compares values of hello1 and hello3, and print the result
        Expected output: true */
        System.out.println(hello1.equals(hello3));

       /* Task 4: convert hello1 and hello2 to all lower case and compare values, and print the result
          Expected output: true*/
        hello2 = hello2.toLowerCase();
        hello1 = hello1.toLowerCase();
        System.out.println(hello1.equals(hello2));

      /*Task 5: convert hello1 and hello3 to all upper case and compare values, and print the result
         Expected output: true */

        hello3 = hello3.toLowerCase();
        hello1 = hello1.toLowerCase();
        System.out.println(hello1.equals(hello3));

    }
}
