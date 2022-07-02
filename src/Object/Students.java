package Object;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student{
        //характеристики - полета
        String firstName;
        String lastName;
        String age;
        String homeTown;
        //конструктор
        public Student(String firstName, String lastName, String age, String homeTown){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getHomeTown() {
            return this.homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] inputStudentArr = input.split(" ");
            String firstName = inputStudentArr[0];
            String lastName = inputStudentArr[1];
            String age = inputStudentArr[2];
            String town = inputStudentArr[3];

            Student currentStudent = new Student(firstName, lastName, age, town);
            studentList.add(currentStudent);

            input = scanner.nextLine();
        }
        String searchTown = scanner.nextLine();
        for (Student item:studentList) {
            if (item.getHomeTown().equals(searchTown)){
                System.out.printf("%s %s is %s years old%n",
                        item.getFirstName(),
                        item.getLastName(),
                        item.getAge());
            }

        }
    }

}
