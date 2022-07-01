import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input =  scanner.nextLine();
        List<String> myList =Arrays.stream(input.split("\\&"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while(!command.equals("Done")){
            String[] commandArr = command.split("\\s\\|\\s");
            switch (commandArr[0]){
                case"Add Book":{
                    String bookName = commandArr[1];
                    int index = myList.indexOf(bookName);
                    if(index==-1){
                        myList.add(0, bookName);
                    }
                };
                break;
                case"Take Book":{
                    String bookName = commandArr[1];
                    int index = myList.indexOf(bookName);
                    if(index!=-1){
                        myList.remove(index);
                    }
                };
                break;
                case"Swap Books":{
                    String bookName1 = commandArr[1];
                    String bookName2 = commandArr[2];
                    int index1 = myList.indexOf(bookName1);
                    int index2 = myList.indexOf(bookName2);
                    if(index1!=-1 && index2 !=-1){
                        String help = myList.get(index1);
                        myList.set(index1,bookName2);
                        myList.set(index2,help);
                    }
                };
                break;
                case"Insert Book":{
                    String bookName = commandArr[1];
                    int index = myList.indexOf(bookName);
                    if(index==-1){
                        myList.add(bookName);
                    }
                };
                break;
                case"Check Book":{
                    int index = Integer.parseInt(commandArr[1]);
                    if(index >-1 && index<myList.size()){
                        System.out.println(myList.get(index));
                    }
                };
                break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0;i < myList.size()-1;i++){
            System.out.print(myList.get(i)+", ");
        }
        System.out.print(myList.get(myList.size()-1));

    }

    }

