import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPieces = Integer.parseInt(scanner.nextLine()); //брой на пиесите
        //пиеса -> списък с информация ([0] -> композитора, [1] -> тоналност)
        Map<String, List<String>> piecesMap = new LinkedHashMap<>();
        //информация за пиеса
        for (int piece = 1; piece <= countPieces; piece++) {
            String pieceData = scanner.nextLine();
            //"{piece}|{composer}|{tone}"
            String[] piecePart = pieceData.split("\\|"); //["{piece}", "{composer}", "{tone}"]
            String pieceName = piecePart[0];
            String composer = piecePart[1];
            String tone = piecePart[2];

            List<String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer); //[0]
            pieceInfo.add(tone); //[1]

            piecesMap.put(pieceName, pieceInfo);
        }

        //получаваме команди
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            if (command.contains("Add")) {
                //command = "Add|{piece}|{composer}|{key}".split("|") -> ["Add", "{piece}", "{composer}", "{key}"]
                String pieceName = command.split("\\|")[1];
                String composer = command.split("\\|")[2];
                String tone = command.split("\\|")[3];
                //има такава пиеса
                if (piecesMap.containsKey(pieceName)) {
                    System.out.println(pieceName + " is already in the collection!");
                } else {
                    //не съществува такава пиеса
                    //пиеса -> списък с информация([0] -> composer, [1] -> tone)
                    List<String> info = new ArrayList<>();
                    info.add(composer);
                    info.add(tone);

                    piecesMap.put(pieceName, info);
                    System.out.printf("%s by %s in %s added to the collection!%n", pieceName, composer, tone);
                }
            } else if (command.contains("Remove")) {
                //command = "Remove|{piece}".split("|") -> ["Remove", "{piece}"]
                String removedPiece = command.split("\\|")[1];
                //имаме такава пиеса
                if (piecesMap.containsKey(removedPiece)) {
                    piecesMap.remove(removedPiece);
                    System.out.printf("Successfully removed %s!%n", removedPiece);
                } else {
                    //нямаме такава пиеса
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", removedPiece);
                }
            } else if (command.contains("ChangeKey")) {
                //command = "ChangeKey|{piece}|{new key}".split("|") -> ["ChangeKey", "{piece}", "{new tone}"]
                String pieceName = command.split("\\|")[1];
                String newTone = command.split("\\|")[2];

                //нямаме такава пиеса
                if (!piecesMap.containsKey(pieceName)) {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
                } else {
                    //имаме такава пиеса
                    //пиеса -> списък с информация {composer, tone}
                    List<String> currentInfo = piecesMap.get(pieceName);
                    currentInfo.remove(1); //{composer}
                    currentInfo.add(newTone); //{composer, newTone}
                    piecesMap.put(pieceName, currentInfo);
                    System.out.printf("Changed the key of %s to %s!%n", pieceName, newTone);
                }
            }
            command = scanner.nextLine();
        }

        //пиеса -> списък с информация ([0] -> композитор, [1] -> тоналност)
        //"{Piece} -> Composer: {composer}, Key: {key}"
        //entry.getKey() -> име на пиесата
        //entry.getValue() -> {composer, tone}.get(0) -> composer
        //entry.getValue() -> {composer, tone}.get(1) -> tone
        piecesMap.entrySet() //всички записи
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }

    }

