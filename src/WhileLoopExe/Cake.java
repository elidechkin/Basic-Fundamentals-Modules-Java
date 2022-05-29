package WhileLoopExe;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widht = Integer.parseInt(scanner.nextLine());
        int lendht = Integer.parseInt(scanner.nextLine());
        int totalPieces = widht * lendht;


        while (totalPieces >= 0){
            String input = scanner.nextLine();

            if (input.equals("STOP")){
                break;
            }
            int pieces = Integer.parseInt(input);

            totalPieces -= pieces;



        }
        if (totalPieces >=0){
            System.out.printf("%d pieces are left.", totalPieces );
        }else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces));
        }

    }
}
