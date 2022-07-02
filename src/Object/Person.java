package Object;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    // полета = характеристики
    private String name;
    private int age;

    //конструктор
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //методи ->  няма функционалности
    public String getName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String personalData = scanner.nextLine();
            String name = personalData.split(" ")[0];
            int age = Integer.parseInt(personalData.split(" ")[1]);

            if (age > 30){
                Person person = new Person(name, age);
                personList.add(person);
            }

        }
        for (Person person: personList) {
            System.out.println(person.getName() + " - " + person.getAge());

        }
    }
}
