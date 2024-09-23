import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileTextStats {
    public static void main(String[] args) {
        String fileName = "TEXT.txt";
        writeToFile(fileName);
        try {
            readFileAndDisplayStats(fileName);
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e.getMessage());
        }
    }
    public static void writeToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, this is a sample text file.\n");
            writer.write("It contains multiple lines.\n");
            writer.write("Each line has several words.\n");
            writer.write("Java programming is fun!\n");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    public static void readFileAndDisplayStats(String fileName) throws IOException {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.split("\\s+");
                wordCount += words.length;
                charCount += line.length();
            }
        }
        System.out.println(String.format("%-20s %s", "Metric", "Count"));
        System.out.println("------------------------------");
        System.out.println(String.format("%-20s %d", "Number of lines:", lineCount));
        System.out.println(String.format("%-20s %d", "Number of words:", wordCount));
        System.out.println(String.format("%-20s %d", "Number of characters:", charCount));
    }
}