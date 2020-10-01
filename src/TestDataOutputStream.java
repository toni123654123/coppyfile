import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutputStream {
    public static void main(String[] args) {
        int a[] = {2,3,5,7,11};
        try{
            FileOutputStream fout = new FileOutputStream("hello");
            DataOutputStream dout = new DataOutputStream(fout);
            for (int i = 0; i < a.length; i++) {
                dout.writeInt(a[i]);

            }
            dout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
