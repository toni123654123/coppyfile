
import java.io.FileWriter;
import java.io.IOException;

public class TestWrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("test.txt");
            writer.write("heeheheheh");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
