package Day28;

import java.util.ArrayList;

public class PracticeArrayListHW {
    public static void main(String[] args) {
       /* Create PracticeArrayListHW java class and do the following tasks:
        1. Create arrayList of Strings, add 5 values
        2. Declare boolean check1; check whether arrayList is empty and assign value into boolean variable
        3. Remove all values from arrayList
        4. Declare boolean check2; check whether arrayList is empty and assign value into boolean variable
        5. Print check1 and check2
        Expected output:
        false
        true   */

        ArrayList <String> nameList = new ArrayList<>();
        nameList.add("Ella");
        nameList.add("Mia");
        nameList.add("Sofi");
        nameList.add("Alex");
        nameList.add("Mark");

        boolean check1 = nameList.isEmpty();
        System.out.println(check1);

        nameList.clear();

        boolean check2 = nameList.isEmpty();

        System.out.println(check2);

    }
}
