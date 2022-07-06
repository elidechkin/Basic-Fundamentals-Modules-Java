package exam;

import java.util.Scanner;

public class SalesTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sea = Integer.parseInt(scanner.nextLine());
        int mountain = Integer.parseInt(scanner.nextLine());
        
        double profitSea = 0;
        double profitMountain = 0;

        for (int i = 0; i < 500; i++) {
            String type = scanner.nextLine();
            if (type.equals("sea")){
                if (sea <= 0){
                    profitSea += 0;
                }else if (sea > 0){
                    profitSea += 680;
                    sea --;
                } else if (sea == 0){
                    break;
                }

            }else if (type.equals("mountain")){
                if (mountain <= 0){
                    profitMountain += 0;
                }else if (mountain > 0){
                    profitMountain += 499;
                    mountain --;
                }else if (mountain == 0){
                    break;
                }

            }else if (type.equals("Stop")){
                break;
            }
            if (sea + mountain == 0){
                System.out.println("Good job! Everything is sold.");
                break;

        }

        }
            System.out.printf("Profit: %.2f leva.", profitMountain + profitSea);
        }


    }

