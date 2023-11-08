package Assignment_1_Day30;

import java.util.HashSet;

public class PracticeSetHW {
    public static void main(String[] args) {
        /*
        •Create a HashSet of String “colors” and add six colors.
        •Iterate over the set and print each element.
        •Print the number of elements in set.
        •Remove all elements from the set.
        •Print if the set is full or empty.
        •Add 3 elements to set.
        •Convert the set to array and print it.
         */
        HashSet<String> colors = new HashSet<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("White");
        colors.add("Gray");
        colors.add("Pink");

        for (String color : colors) {
            System.out.println("Color in colors hashSet: " + color);
        }

        int numberOfElements = colors.size();
        System.out.println("Number of elements is: " + numberOfElements);

        colors.clear();

        if (colors.isEmpty()) {
            System.out.println("The set is empty.");
        } else {
            System.out.println("if the set is full");
        }

        colors.add("Black");
        colors.add("Purple");
        colors.add("Brown");

        String[] colorsArray = new String[colors.size()];
        colors.toArray(colorsArray);

        for (String color : colorsArray) {
            System.out.println(color);
        }
    }
}