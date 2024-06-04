package br.com.construtor;

public class Students extends Person{

    double StudentID;

    public Students(String name, int age, double studentID) {
        super(name, age);
        StudentID = studentID;
    }

    public void info() {
        System.out.println("ID Students: " + StudentID);
    }
}
