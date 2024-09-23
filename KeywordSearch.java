import java.io.*;
import java.util.Scanner;

public class KeywordSearch {
    public static void main(String[] args) {
        String fileName = "input.txt";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the keyword to search: ");
        String keyword = scanner.nextLine();
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 0;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                lineNumber++;
                int index = line.indexOf(keyword);
                if (index != -1) {
                    System.out.println("Keyword found at line " + lineNumber + ", index " + index);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Keyword not found in the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
