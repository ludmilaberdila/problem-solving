public class StringManipulat1 {
    public static void main(String[] args) {
     /* 1# Write a program that prints the length of a given string.
        Expected result: some number */
        String str = "This is a random string for testing purposes";
        System.out.println(str.length());
     /* 2# Write a program that prints the 3rd character of a given string.
         Expected result: "T"  */
        System.out.println(str.charAt(0));

     /* 3# Write a program that prints the last character of a given string. */
       System.out.println(str.charAt(43));

     /* 4# Write a program that replaces all occurrences of a letter “o” and
        “s” in a given string with a letter"i" and prints it.
        Expected result: Thii ii a randim itring fir teiting purpiiei   */
        // use regex, replaceAll takes an array of string and replace with string i
//        System.out.println(str.replaceAll("[os]",  "i"));
        String a1 = str.replaceAll("o",  "i");
        a1 = a1.replaceAll("s", "i");
        System.out.println(a1);

      /* 5# Write a program that removes all spaces from a given string and prints it. */
        String a2 = str.replaceAll(" ",  "");
        System.out.println(a2);

     /*6# Write a program that extracts as substring from a given string word "random" and prints it. */
        String t = "This is a  string for testing  purposes random";
        String b1 = "";
        int start = t.indexOf("random");
        int end = "random".length() + start;
        System.out.println("use subsrting method = " + (t.substring(start, end)));
        for(int i = start; i < end; i++) {
            b1 += t.charAt(i);
        }
        System.out.println(b1);

      /* 7# Write a program that that prints reversed the result of task 6 and prints it
        in capital letters, Expected result: MODNAR  */
        System.out.print(b1.toUpperCase().charAt(5));
        System.out.print(b1.toUpperCase().charAt(4));
        System.out.print(b1.toUpperCase().charAt(3));
        System.out.print(b1.toUpperCase().charAt(2));
        System.out.print(b1.toUpperCase().charAt(1));
        System.out.print(b1.toUpperCase().charAt(0));

    }
}
