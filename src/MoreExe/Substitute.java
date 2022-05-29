package MoreExe;

import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isFinish = false;


        for (int i = k; i <= 8; i++) {
            if (i % 2 == 1) {
                continue;
            }
            for (int j = 9; j >= l; j--) {
                if (j % 2 == 0) {
                    continue;
                }
                for (int o = m; o <= 8; o++) {
                    if (o % 2 == 1) {
                        continue;
                    }
                    for (int p = 9; p >= n; p--) {
                        if (p % 2 == 0) {
                            continue;
                        }

                        if (i == o && j == p) {
                            System.out.println("Cannot change the same player.");

                        } else {
                            System.out.printf("%d%d - %d%d%n", i, j, o, p);
                            counter++;
                        }
                        if (counter == 6) {
                            isFinish=true;
                            break;
                        }
                    }

                }
                if (isFinish){
                    break;
                }
            }
            if (isFinish){
                break;
            }
        }
    }
}
