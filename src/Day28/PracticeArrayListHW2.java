package Day28;

import java.util.ArrayList;

public class PracticeArrayListHW2 {
    public static void main(String[] args) {
       /* 1. Create ArrayList<String> cars and add 5 elements.
        2. Remove elements at indexes #0 and #2.
        3. Add 3 more elements.
        4. Print the size of arraylist, like => "The number of cars is: 6.
        5. Print all elements using while loop
        6. Remove all elements with a length less than 7
        7. Again print the size of cars.
        8. Print again all elements using for loop  */

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Opel");
        cars.add("Ford");
        cars.add("AlfaRomeo");
        cars.add("Lexus");
        cars.add("Pontiac");

        cars.remove(0);
        cars.remove(2);
        System.out.println(cars);

        cars.add("Toyota");
        cars.add("Chevrolet");
        cars.add("Hyundai");
        System.out.println(cars);

        System.out.println(" Cars Name list : " + cars.size());

        System.out.println("Printing carsName using while loop:");
        int i = 0;
        while (i < cars.size()) {
            System.out.println(cars.get(i));
            i++;
        }

        i = 0;
        while (i < cars.size()) {
            if (cars.get(i).length() < 7) {
                cars.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("removing elements with length less than 7: " + cars.size());

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
