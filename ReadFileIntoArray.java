import java.io.*;
import java.util.ArrayList;

public class ReadFileIntoArray {
    public static void main(String[] args) {
        String fileName = "input.txt";
        ArrayList<String> linesList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                linesList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] linesArray = new String[linesList.size()];
        linesArray = linesList.toArray(linesArray);

        System.out.println("Lines in the array:");
        for (String line : linesArray) {
            System.out.println(line);
        }
    }
}
