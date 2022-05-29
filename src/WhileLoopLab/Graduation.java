package WhileLoopLab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int grade = 1;
        double allGrade = 0;
        int poorGrade = 0;

        while (grade <= 12){
            double yearGrade = Double.parseDouble(scanner.nextLine());

            if (yearGrade >= 4.00){
                poorGrade = 0;
                allGrade += yearGrade;
                grade ++;

            }else {
                poorGrade ++;
                if (poorGrade > 1){
                    System.out.printf("%s has been excluded at %d grade",name, grade);
                    break;
                }
            }

        }
        if (grade > 12){
            System.out.printf("%s graduated. Average grade: %.2f", name, allGrade / 12 );
        }
    }
}
