package TextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        String[] folderName = path.split("\\\\");
        String fullName = folderName[folderName.length - 1];

        String fileName = fullName.split("\\.")[0];
        String extension = fullName.split("\\.")[1];

        System.out.println("File name: " + fileName );
        System.out.println("File extension: " + extension);
    }
}
