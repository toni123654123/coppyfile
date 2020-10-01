import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Path;

public class CoppyFile {
    public static void main(String[] args) {
        InputStream inStream = null;
        OutputStream outStream = null;
//        FileInputStream fin = null;
        try {
            inStream = new FileInputStream(new File("test.txt"));
            outStream = new FileOutputStream(new File("txt3.txt"));
            int length;
            byte[] buffer = new byte[2048];
//            int bytesRead = fin.read(buffer);

            while ((length = inStream.read(buffer))>0){
                outStream.write(buffer,0,length);

            }
//            while (bytesRead !=-1) {
//                for (int i = 0; i < bytesRead; i++) {
//                    System.out.println((buffer[i]));
//                }
//            }

            System.out.println("File is copied successful!");
            inStream.close();
            outStream.close();
        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }
}
