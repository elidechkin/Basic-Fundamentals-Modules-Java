package MoreExe;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.next());

           double cake = rent * 0.20;
           double drink = cake - (cake * 0.45);
           double anim = rent / 3;

           double budget = rent + cake + drink + anim;

        System.out.println(budget);

    }
}
