package Assignment_2_Day23;

public class Problem1 {
    public static void main(String[] args) {
        Mobile samsung = new Mobile();
        samsung.model = "Samsung";
        samsung.price = 1200;
        samsung.memory = "250GB";
        samsung.ring();
        samsung.turnOn();
        samsung.turnOff();
        System.out.println("------------------------------------");

        Mobile lg = new Mobile();
        lg.model = "LG";
        lg.price = 1250;
        lg.memory = "128GB";
        lg.ring();
        lg.turnOn();
        lg.turnOff();
        System.out.println("----------------------------------------");

        Mobile htc = new Mobile();
        htc.model = "HTC";
        htc.price = 2000.99;
        htc.memory = "320GB";
        htc.ring();
        htc.turnOn();
        htc.turnOff();

    }
}
