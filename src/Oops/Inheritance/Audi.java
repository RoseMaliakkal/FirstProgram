package Oops.Inheritance;

//explains hierarchical inheritance
public class Audi extends Car {
    static String name = "Audi";

    public static void main(String[] args) {
        Car car = new Car();
        System.out.print(name);
        car.run();
    }
}
