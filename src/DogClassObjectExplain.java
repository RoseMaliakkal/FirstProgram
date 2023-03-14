public class DogClassObjectExplain {
    String name = "Cia";
    int age = 4;
    String breed = "Golden Retriever";

    public void Barking() {
        System.out.println(name + " is barking");
    }

    public static void main(String[] args) {
        DogClassObjectExplain obj1 = new DogClassObjectExplain();
        obj1.Barking();
        System.out.println(obj1.name + " is a " + obj1.breed);
        System.out.println(obj1.name + " is " + obj1.age + " months old");
    }
}
