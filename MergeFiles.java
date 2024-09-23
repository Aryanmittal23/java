import java.io.*;

public class MergeFiles {
    public static void main(String[] args) {
        String file1Name = "file1.txt";
        String file2Name = "file2.txt";
        String outputFileName = "merged.txt";

        try (BufferedReader br1 = new BufferedReader(new FileReader(file1Name));
             BufferedReader br2 = new BufferedReader(new FileReader(file2Name));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;

            while ((line = br1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            while ((line = br2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Files merged successfully into " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
