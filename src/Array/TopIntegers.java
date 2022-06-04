package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arr= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        StringBuilder output=new StringBuilder();

        for (int i=0; i < arr.length; i++){
            boolean isBigger=true;
            for (int j=i+1; j<arr.length; j++){
                if (!(arr[i] > arr[j])) {
                    isBigger = false;
                    break;
                }
            }
            if(isBigger){
                output.append(arr[i]).append(" ");
            }
        }
        System.out.println(String.join(" ",output));
    }
}
