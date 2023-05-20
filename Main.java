import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        String fileName = "ProgrammingHistory";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word you want to search: ");
        String word = scanner.nextLine();

        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            String aLine = lines.get(i);
            if (aLine.contains(word)) {
                indexes.add(i);
            }
        }

        int count = indexes.size();

        System.out.println("Word: " + word);
        System.out.println("Index positions: " + indexes);
        System.out.println("Occurrences: " + count);
    }
}
