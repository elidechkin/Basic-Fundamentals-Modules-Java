package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> timeNeededList = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int middleLine = timeNeededList.size() / 2;

        double totalTimeLeftCar = 0;
        double totalTimeRightCar = 0;


        for (int i = 0; i <middleLine ; i++) {
            double leftCarTime = timeNeededList.get(i);

            if (leftCarTime == 0){
                totalTimeLeftCar = totalTimeLeftCar - (totalTimeLeftCar * 0.20);

            }
            totalTimeLeftCar += leftCarTime;
        }
        for (int i = timeNeededList.size() -1;  i > middleLine; i--) {
            double rightCarTime = timeNeededList.get(i);
            if (rightCarTime == 0){
                totalTimeRightCar= totalTimeRightCar- (totalTimeRightCar * 0.20);
            }
            totalTimeRightCar += rightCarTime;

        }


        if (totalTimeLeftCar < totalTimeRightCar){
            System.out.printf("The winner is left with total time: %.1f",totalTimeLeftCar);
        }else {
            System.out.printf("The winner is right with total time: %.1f",totalTimeRightCar);
        }

    }


}
