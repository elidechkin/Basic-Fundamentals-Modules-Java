package TrainingFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrNum = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumAllArrNum = 0;
        int averigeArray = 0;
        for (int i = 0; i < arrNum.length ; i++) {
            int currentNum = arrNum[i];
            sumAllArrNum += currentNum;
        }
        averigeArray = sumAllArrNum / arrNum.length;

        int countNumMaxAv = 0;

        for (int current:arrNum) {
            if (current > averigeArray){
              countNumMaxAv ++;
              if (countNumMaxAv > 5){
                  break;
              }

                System.out.print(current + " ");
            }


                System.out.println("No");


            }

        }

    }


//if (current < averigeArray){
//                System.out.println("No");