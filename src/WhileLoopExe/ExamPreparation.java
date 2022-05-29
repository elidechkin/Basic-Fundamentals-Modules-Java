package WhileLoopExe;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int failedThresHold = Integer.parseInt(scanner.nextLine());
        String task = scanner.nextLine();

       int failedTime = 0;
       int solved = 0;
       double gradeSum= 0;
       String lastProblem = "";


       while (!task.equals("Enough")){
           double grade = Double.parseDouble(scanner.nextLine());
           gradeSum += grade;
           solved ++;

            if ( grade <= 4){
               failedTime ++;
               if (failedTime == failedThresHold){
                   System.out.printf("You need a break, %d poor grades.", failedTime);
                   break;
               }
           }
           lastProblem = task;
           task = scanner.nextLine();


       }
       if ( task.equals("Enough")){
           System.out.printf("Average score: %.2f%n", gradeSum / solved);
           System.out.printf("Number of problems: %d%n", solved);
           System.out.printf("Last problem: %s", lastProblem);
       }


    }
}
