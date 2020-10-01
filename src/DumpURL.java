import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class DumpURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.youtube.com/");
            URLConnection con = url.openConnection();
            InputStream stream = con.getInputStream();
            InputStreamReader ir = new InputStreamReader(stream);
            BufferedReader reader = new BufferedReader(ir);
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
