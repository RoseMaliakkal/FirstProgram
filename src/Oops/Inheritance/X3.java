package Oops.Inheritance;

public class X3 extends BMW {
    static String model = "X3";

    public static void main(String[] args) {
        BMW bmw = new BMW();
        System.out.print(name + " " + model);
        bmw.run();

    }
}
