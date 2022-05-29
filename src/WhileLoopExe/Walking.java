package WhileLoopExe;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;
        String input = scanner.nextLine();

        int reachedStep = 0;

        while (!input.equals("Going home")){
            int step = Integer.parseInt(input);
            reachedStep += step;

            if (reachedStep >= goal){
                break;
            }
            input = scanner.nextLine();

        }
        if (input.equals("Going home")){
            int stepHome = Integer.parseInt(scanner.nextLine());
            reachedStep += stepHome ;
        }

        if (reachedStep >= goal){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", reachedStep - goal);
        }else {
            System.out.printf("%d more steps to reach goal.", goal - reachedStep);
        }


    }
}
