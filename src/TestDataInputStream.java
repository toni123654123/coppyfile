import java.io.*;

public class TestDataInputStream {
    public static void main(String[] args) {
        FileInputStream fin;
        try {
            fin = new FileInputStream("test.txt");
            DataInputStream din = new DataInputStream(fin);
            while (true){
                System.out.println(din.readInt());
            }
        } catch (EOFException e) {
        } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

