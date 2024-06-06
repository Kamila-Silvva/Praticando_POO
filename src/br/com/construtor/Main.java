package br.com.construtor;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Kamila", 20);
        person.info();

        Students students = new Students("Kamila", 20, "252000");
        students.info();
    }
}
