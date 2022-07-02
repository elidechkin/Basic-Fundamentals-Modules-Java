package Object;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentsExe {
    //полета = характеристики ( какво има студента)
    private  String name;
    private String lastName;
    private  double grade;
    // конструктор
    public StudentsExe(String name, String lastName, double grade){
        this.name = name;
        this.lastName = lastName;
        this.grade = grade;
    }
    // методи -> функционалности ( какво прави студента)
    public double getGrade() {
        return this.grade;
    }
    public String toString (){;
        return String.format("%s %s: %.2f", this.name, this.lastName, this.grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<StudentsExe> studentList = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            String personalDate = scanner.nextLine();
            String name = personalDate.split(" ")[0];
            String lastName = personalDate.split(" ")[1];
            double grade = Double.parseDouble(personalDate.split(" ")[2]);

            StudentsExe student = new StudentsExe(name, lastName, grade);
            studentList.add(student);
        }
        //имаме списък със студенти от класа StudentExe
        studentList.sort(Comparator.comparingDouble(StudentsExe::getGrade).reversed());

        for (StudentsExe student: studentList) {
            System.out.println(student.toString());

        }
    }
}
