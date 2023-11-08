package Assignment_1_Day37;
    /*Define an abstract class called Shape with the following properties and methods:

    Properties:
        name (String): Name of the shape.

    Methods:
        abstract void calculateArea(): Calculates and prints the area of the shape.
        abstract void calculatePerimeter(): Calculates and prints the perimeter of the shape.
        void displayInfo(): Print the name, area, and perimeter of the shape (call inside a method other method).
    Constructor with all instance variables */
   abstract class Shape {
        String name;

        public Shape(String name) {
            this.name = name;
        }

        abstract void calculateArea();

        abstract void calculatePerimeter();

        void displayInfo() {
            System.out.println("Shape" + name);
            calculatePerimeter();
            calculatePerimeter();
        }
    }