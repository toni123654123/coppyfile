import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        System.out.println("Does it exits? " + file.exists());
        System.out.println("The file has? " + file.length()+" bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("It is file? " + file.isFile());
        System.out.println("It is absolute? " + file.isAbsolute());
        System.out.println("It is hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("last modified " + new Date(file.lastModified()));
    }
}
