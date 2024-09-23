import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        String sourceFileName = "source.txt";
        String destinationFileName = "destination.txt";

        try (InputStream in = new FileInputStream(sourceFileName);
             OutputStream out = new FileOutputStream(destinationFileName)) {
             
            byte[] buffer = new byte[1024];
            int length;

            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
