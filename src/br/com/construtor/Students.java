package br.com.construtor;

public class Students extends Person{

    String StudentID;

    public Students(String name, int age, String studentID) {
        super(name, age);
        StudentID = studentID;
    }

    public void info() {
        System.out.println("ID Students: " + StudentID);
    }
}
