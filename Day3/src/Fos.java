import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Fos {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        fos.close();

        FileWriter fw = new FileWriter("fos.txt");
        for (int i =1; i<11; i++) {
            String data = i+" 번째 줄입니다. \r\n";
            fw.write(data);
        }
        fw.close();

        FileWriter fw2 = new FileWriter("fos.txt");
        for(int i=11; i<21; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            fw2.write(data);
        }
        fw2.close();
    }
}
