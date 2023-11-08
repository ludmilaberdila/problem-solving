package Assignment_2_Day23;

public class Mobile {


   /* Create Mobile class with following variables: String model, double price, String memory
    add methods:
    void ring() - it must print that mobile with "model" is ringing
    void turnOn() - it must print that mobile with '"model" is turning on
    void turnOff() - it must print that mobile with "model" is turning off
    1. In the main method  create 3 objects of Mobile
    2. Then assign values to object's attributes
    3. Then call 3 methods for all objects

    Expected output:
    Samsung is ringing
    Samsung is turning on
    Samsung is turning off

    Iphone is ringing
    Iphone is turning on
    Iphone is turning off

    RedMi is rining
    RedMi is turning on
    RedMi is turning off */
    String model;
    double price;
    String memory;
    public void ring(){
        System.out.println(model + " is rining");
    }
    public void turnOn(){
        System.out.println(model + " is turning ON");
    }
    public void turnOff(){
        System.out.println(model + " is turning Off");
    }
}
