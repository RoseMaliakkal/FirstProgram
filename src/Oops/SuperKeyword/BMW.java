package Oops.SuperKeyword;

public class BMW extends Car {
    String name = "BMW";

    public BMW() {
        super();
        System.out.println("BMW constructor");
    }

    public void run() {
        super.run();
        System.out.println("BMW is running");
    }

    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.run();
    }
}
