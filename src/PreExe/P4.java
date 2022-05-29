package PreExe;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudent = Integer.parseInt(scanner.nextLine());
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        int group4 = 0;
        double sumGrade1 = 0;
        double sumGrade2 = 0;
        double sumGrade3 = 0;
        double sumGrade4 = 0;

        for (int i = 1; i <= countStudent ; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 5){
                group1 ++;
                sumGrade1 += grade;
            }else if ( grade >= 4 && grade <= 4.99){
                group2 ++;
                sumGrade2 += grade;
            }else if ( grade >=3 && grade <= 3.99){
                group3 ++;
                sumGrade3 += grade;
            }else  if ( grade < 3){
                group4 ++;
                sumGrade4 += grade;

            }


        }
        double totalGrade = sumGrade1 + sumGrade2 + sumGrade3 + sumGrade4;

        System.out.printf("Top students: %.2f%%%n", (group1 / countStudent) * 100.00);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", group2 / countStudent * 100.00);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", group3 / countStudent * 100.00);
        System.out.printf("Fail: %.2f%%%n", group4 / countStudent * 100.00);
        System.out.printf("Average: %.2f", totalGrade / countStudent);
    }
}
