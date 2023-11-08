package Day28;

import java.util.ArrayList;
import java.util.List;

public class PracticeArrayListHW3 {
    public static void main(String[] args) {

    /*Task 3:
    Create PracticeArrayListHW3 java class and do the following tasks:
    1. Create ArrayList<Integer> years and add 5 elements.
    2. Remove first and last indexes
    3. Add 5 more elements.
    4. Print the size of arraylist, like => "The number of years is: ?"
    5. Print all elements using for loop.
    6. Remove all elements which are prime numbers.
    7. Again print the size of arraylist.
    8. Print again all elements using do while loop */

        ArrayList<Integer> years = new ArrayList<Integer>();
        years.add(1940);
        years.add(1987);
        years.add(2013);
        years.add(1990);
        years.add(2023);

        years.remove(0);
        years.remove(years.size() - 1);

        years.add(1945);
        years.add(1987);
        years.add(1986);
        years.add(2014);
        years.add(2023);


        System.out.println("The number of years is: " + years.size());

        for (int i = 0; i < years.size(); i++) {
            System.out.println(years.get(i));
        }
        for (int i = years.size() - 1; i >= 0; i--) {
            if (isPrime(years.get(i))) {
                years.remove(i);
            }
        }

        System.out.println("The number of years after removing prime numbers is: " + years.size());

        System.out.println("All elements using do while loop:");
        int index = 0;
        do {
            System.out.println(years.get(index));
            index++;
        } while (index < years.size());
    }
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

