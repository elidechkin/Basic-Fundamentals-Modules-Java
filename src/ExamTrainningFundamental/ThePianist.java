package ExamTrainningFundamental;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> piecesMap = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String pieceData = scanner.nextLine();
            String[] piecePart = pieceData.split("\\|");

            String pieceName = piecePart[0];
            String composer = piecePart[1];
            String tone = piecePart[2];

            List<String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer);
            pieceInfo.add(tone);

            piecesMap.put(pieceName, pieceInfo);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")){
            if (command.contains("Add")){

            }
        }

    }
}
