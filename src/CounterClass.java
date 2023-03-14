public class CounterClass {
    int i = 10;
    static int j = 25;

    public CounterClass() {
        i++;
        j++;
        System.out.println("Value of i: " + i);
        System.out.println("Value of j: " + j);
    }

    public static void display() {
        System.out.println("static method executed");
    }

    public static void main(String[] args) {
        CounterClass obj = new CounterClass();
        CounterClass obj2 = new CounterClass();
        CounterClass obj3 = new CounterClass();
        System.out.println(obj.i);
        System.out.println(CounterClass.j);
        CounterClass.display();
    }
}
