package Oops.Polymorphism.MethodOverloading;

public class Addition {
    public void AddValues(int i, int j) {
        int c = i + j;
        System.out.println("Addition is " + c);
    }

    public void AddValues(int i, int j, int k) {
        int c = i + j + k;
        System.out.println("Addition is " + c);
    }

    public void AddValues(double i, double j) {
        double c = i + j;
        System.out.println("Addition is " + c);
    }
}
