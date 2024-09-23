import java.io.*;
import java.util.*;

public class MergeSortedFiles {
    public static void main(String[] args) {
        String sourceFile1 = "Source1.txt";
        String sourceFile2 = "Source2.txt";
        String targetFile = "Target.txt";

        try {
            List<Integer> mergedList = mergeSortedFiles(sourceFile1, sourceFile2);
            saveToFile(targetFile, mergedList);
            System.out.println("Merged list saved to " + targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> mergeSortedFiles(String file1, String file2) throws IOException {
        List<Integer> list1 = readFile(file1);
        List<Integer> list2 = readFile(file2);
        List<Integer> mergedList = new ArrayList<>();

        int i = 0, j = 0;

        // Merge the two sorted lists
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        // Add remaining elements
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    private static List<Integer> readFile(String filename) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line.trim()));
            }
        }
        return numbers;
    }

    private static void saveToFile(String filename, List<Integer> numbers) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Integer number : numbers) {
                bw.write(number.toString());
                bw.newLine();
            }
        }
    }
}
