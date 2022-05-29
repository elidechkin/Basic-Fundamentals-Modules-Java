package Training;

import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int games = Integer.parseInt(scanner.nextLine());

        double hearthStone = 0;
        double fornite = 0;
        double overwatch = 0;
        double others = 0;

        for (int i = 1; i <= games; i++) {
            String nameGames = scanner.nextLine();

            if (nameGames.equals("Hearthstone")){
                hearthStone ++;
            }else if (nameGames.equals("Fornite")){
                fornite ++;
            }else if (nameGames.equals("Overwatch")){
                overwatch ++;
            }else {
                others ++;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%n", hearthStone / games * 100);
        System.out.printf("Fornite - %.2f%%%n", fornite / games * 100.00);
        System.out.printf("Overwatch - %.2f%%%n", overwatch / games * 100.00);
        System.out.printf("Others - %.2f%%%n", others / games * 100.00);


    }
}
