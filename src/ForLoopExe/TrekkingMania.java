package ForLoopExe;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGrup = Integer.parseInt(scanner.nextLine());
        double totalPeople = 0;
        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= countGrup; i++) {
            int group = Integer.parseInt(scanner.nextLine());
            totalPeople += group;
            if (group <= 5) {
                musala += group;
            } else if (group <= 12) {
                monblan += group;
            } else if (group <= 25){
                kilimandjaro += group;
            }else if (group <=40){
                k2 += group;
            }else{
                everest +=group;
            }

        }
        double percMusala = musala  / totalPeople * 100;
        double percMonblan = monblan / totalPeople * 100;
        double percKiliman = kilimandjaro  / totalPeople * 100;
        double percK2 = k2  / totalPeople * 100;
        double percEverest = everest  / totalPeople * 100;

        System.out.printf("%.2f%%%n",percMusala);
        System.out.printf("%.2f%%%n",percMonblan);
        System.out.printf("%.2f%%%n",percKiliman);
        System.out.printf("%.2f%%%n",percK2);
        System.out.printf("%.2f%%%n",percEverest);

    }
}
