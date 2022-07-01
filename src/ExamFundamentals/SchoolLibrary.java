package ExamFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> bookList = Arrays.stream(scanner.nextLine().split("&"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] commandsLine = input.split("\\| ");
            String command = commandsLine[0];
            String item = commandsLine[1];

            switch (command) {
                case "Add Book ":
                    if (!bookList.contains(item)) {
                        bookList.add(0, item);
                    }
                    break;
                case "Take Book ":
                    if (bookList.contains(item)) {
                        bookList.remove(item);
                    }
                    break;
                case "Insert Book ":
                    if (!bookList.contains(item)) {
                        bookList.add(item);
                    }
                    break;
                case "Swap Books ":
                    String newBook = commandsLine[2];
                    if (bookList.contains(item) && bookList.contains(newBook)) {
                        String reserveItem = commandsLine[1];
                        bookList.set(1, newBook);
                        bookList.set(2,reserveItem);


                    }
                    break;
                case "Check Book ":
                    int index = Integer.parseInt(commandsLine[1]);
                    if (index >= 0 && index <= bookList.size())
                    System.out.println(bookList.get(index));
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", bookList));
    }
}
//String bookName1 = commandArr[1];
//                    String bookName2 = commandArr[2];
//                    int index1 = myList.indexOf(bookName1);
//                    int index2 = myList.indexOf(bookName2);
//                    if(index1!=-1 && index2 !=-1){
//                        String help = myList.get(index1);
//                        myList.set(index1,bookName2);
//                        myList.set(index2,help);