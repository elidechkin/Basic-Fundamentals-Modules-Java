package ConditionalStatementAdvanceLab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        String town = scann.nextLine();
        double sales = Double.parseDouble(scann.nextLine());
        double commiss = 0;

        if (sales >= 0 && sales <= 500){
            switch (town){
                case "Sofia":
                    commiss = 0.05;
                    break;
                case "Varna":
                    commiss = 0.045;
                    break;
                case "Plovdiv":
                    commiss = 0.055;
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        }else if(sales > 500 && sales <= 1000){
            switch (town){
                case "Sofia":
                    commiss = 0.07;
                    break;
                case "Varna":
                    commiss = 0.075;
                    break;
                case "Plovdiv":
                    commiss = 0.08;
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        }else if (sales > 1000 && sales <= 10000){
            switch (town){
                case "Sofia":
                    commiss = 0.08;
                    break;
                case "Varna":
                    commiss = 0.10;
                    break;
                case "Plovdiv":
                    commiss = 0.12;
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        }else if (sales > 10000){
            switch (town){
                case "Sofia":
                    commiss = 0.12;
                    break;
                case "Varna":
                    commiss = 0.13;
                    break;
                case "Plovdiv":
                    commiss = 0.145;
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        }else{
            System.out.println("error");
        }
        double result = (sales * commiss);
        if (result != 0){
            System.out.printf("%.2f", result);
        }

    }

        }

