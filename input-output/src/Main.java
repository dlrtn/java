import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class Main {

    private final String testFilePath = "C:\\Users\\JooIcksoo\\IdeaProjects\\java-study\\input-output\\src\\input.txt";

    @Test
    public void fileInputStreamTest() throws IOException {
        try (FileInputStream fis = new FileInputStream(testFilePath)) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void bufferedFileInputStreamTest() throws IOException {
        try (FileInputStream fis = new FileInputStream(testFilePath)) {
            BufferedInputStream bis = new BufferedInputStream(fis);

            int i;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}