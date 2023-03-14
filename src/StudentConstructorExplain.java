// explaining constructor topic by explaining default and parameterized constructor by overloading constructor
public class StudentConstructorExplain {
    public StudentConstructorExplain() {
        System.out.println("I am inside default constructor");
    }

    public StudentConstructorExplain(String name, int roll) {
        System.out.println("My name is " + name);
        System.out.println("My roll nummber is " + roll);
    }

    public static void main(String[] args) {
        StudentConstructorExplain obj = new StudentConstructorExplain();
        StudentConstructorExplain obj2 = new StudentConstructorExplain("Aleena", 123);
    }
}
