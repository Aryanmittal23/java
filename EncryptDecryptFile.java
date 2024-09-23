import java.io.*;

public class EncryptDecryptFile {
    private static final int SHIFT = 3; 

    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String encryptedFileName = "encrypted.txt";
        String decryptedFileName = "decrypted.txt";

        encryptFile(inputFileName, encryptedFileName);
        decryptFile(encryptedFileName, decryptedFileName);
    }

    public static void encryptFile(String inputFileName, String outputFileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                String encryptedLine = encrypt(line);
                writer.write(encryptedLine);
                writer.newLine();
            }

            System.out.println("File encrypted successfully: " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void decryptFile(String inputFileName, String outputFileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                String decryptedLine = decrypt(line);
                writer.write(decryptedLine);
                writer.newLine();
            }

            System.out.println("File decrypted successfully: " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String encrypt(String text) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            encrypted.append((char) (c + SHIFT));
        }
        return encrypted.toString();
    }

    public static String decrypt(String text) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            decrypted.append((char) (c - SHIFT));
        }
        return decrypted.toString();
    }
}
