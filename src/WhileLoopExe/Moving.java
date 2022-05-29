package WhileLoopExe;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        int volume = w * l * h;

        while (volume >= 0){
            String input = scanner.nextLine();

            if (input.equals("Done")){
                break;
            }
            int box = Integer.parseInt(input);
            volume -= box;
        }
        if (volume >= 0){
            System.out.printf("%d Cubic meters left.", volume);
        }else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
        }

    }
}
