package Oops.Polymorphism.MethodOverloading;

public class ChildAddition extends Addition {
    public static void main(String[] args) {
        Addition add = new Addition();
        add.AddValues(10, 20);
        add.AddValues(10, 20, 30);
        add.AddValues(10.5, 20.5);

    }
}
