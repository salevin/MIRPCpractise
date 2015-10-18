import java.util.*;

/**
 * Created by slevin on 10/18/15.
 */
public class Stealth {

    public static ArrayList<ArrayList<String>> getInput() {

        ArrayList<ArrayList<String>> finalResults = new ArrayList<>();
        while (true) {
            String nextLine;
            ArrayList<String> results = new ArrayList<>();
            Scanner sc = new Scanner(System.in);

            while (true) {
                nextLine = sc.nextLine();
                if (nextLine.equals("END") || nextLine.equals("")) {
                    break;
                } else {
                    results.add(nextLine);
                }
            }
            finalResults.add(results);
            if (nextLine.equals("END")) {
                break;
            }
        }

        return finalResults;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> input = getInput();
        ArrayList<String> finalResult = null;
        String line;
        String word;
        HashMap<Character,List<Integer>> currentMap = new HashMap<>();
        ArrayList<Map<Character,List<Integer>>> charMap = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        // For Paragraph
        for (int i = 0; i < input.size(); i++) {
            ArrayList<String> paragraph = input.get(i);
            word = paragraph.remove(0);
            charMap.clear();
            // For line
            for (int z = 0; z <= (paragraph.size() - word.length()); z++) {
                currentMap.clear();
                for (int x = 0; x < word.length(); x++) {
                    line = paragraph.get(z + x);
                    currentList.clear();
                    // For Char
                    for (int y = 0; y < line.length(); y++) {
                        if (line.charAt(y) == word.charAt(x)) {
                            currentList.add(y);
                        }
                    }
                    System.out.println(currentList);
                    System.out.println(word.charAt(x));
                    currentMap.put(word.charAt(x), currentList);
                }
                charMap.add(currentMap);
            }
            System.out.println(charMap);
        }

//        for (String fianlLine : finalResult){
//            System.out.println(fianlLine);
//        }
    }
}
