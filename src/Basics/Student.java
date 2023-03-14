package Basics;

// explaining constructor topic by explaining default and parameterized constructor by overloading constructor
public class Student {
    public Student() {
        System.out.println("I am inside default constructor");
    }

    public Student(String name, int roll) {
        System.out.println("My name is " + name);
        System.out.println("My roll nummber is " + roll);
    }

    public static void main(String[] args) {
        Student obj = new Student();
        Student obj2 = new Student("Aleena", 123);
    }
}
