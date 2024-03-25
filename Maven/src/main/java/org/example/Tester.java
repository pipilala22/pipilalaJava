package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;


    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Intermediate", 0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 0);
    }


    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Experience: " + experienceInYears + " years");
        System.out.println("English level: " + englishLevel);
        System.out.println("Salary: " + salary);
    }

    public void printInfo(boolean detailed) {
        if (detailed) {
            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
            System.out.println("Experience: " + experienceInYears + " years");
            System.out.println("English level: " + englishLevel);
            System.out.println("Salary: " + salary);
        } else {
            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
        }
    }

    public void printInfo(String message) {
        System.out.println(message);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
    }

    // Статический метод
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
}