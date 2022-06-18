package Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //"1 2 3 |4 5 6 |  7  8"
        List<String> listSeparatedByPipe = Arrays.stream(input.split("\\|"))
                .collect(Collectors.toList());
        //"1 2 3 |4 5 6 |  7  8" -> split -> ["1 2 3 ", "4 5 6 ", "  7  8"] -> {"1 2 3 ", "4 5 6 ", "  7  8"}

        Collections.reverse(listSeparatedByPipe);// подреждаме ги наобратно
        // reverse ->  {"  7  8", "4 5 6 ", "1 2 3 "}

        //list.toString() -> "7 8 4 5 6 1 2 3"
        System.out.println(listSeparatedByPipe.toString() //"[  7  8, 4 5 6 , 1 2 3 ]"печате, а вследващите редове премахваме
                .replace("[", "") //"  7  8, 4 5 6 , 1 2 3 ]"// вс. ненужни елементи
                .replace("]", "") //"  7  8, 4 5 6 , 1 2 3 "
                .trim()  //"7  8, 4 5 6 , 1 2 3"
                .replaceAll(",", "") //"7  8 4 5 6  1 2 3"
                .replaceAll("\\s+", " ")); //"7 8 4 5 6 1 2 3"


    }

}
