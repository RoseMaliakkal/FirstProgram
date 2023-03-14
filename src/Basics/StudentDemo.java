package Basics;

public class StudentDemo {
    int rollNumber;
    String name;
    String Standard;
    public StudentDemo(int rollNumber,String name, String Standard){
        this.rollNumber=rollNumber;
        this.name=name;
        this.Standard=Standard;
    }
    public void display(){
        System.out.println("My name is "+name+"\nMy roll number is "+rollNumber+"\nMy standard is "+Standard);
    }
    public static void main(String[] args){
        StudentDemo obj=new StudentDemo(123,"Aleena","5th");
        obj.display();
    }
}
