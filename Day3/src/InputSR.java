import javax.print.DocFlavor;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputSR {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in); // 생성자의 입력으로 객체가 필요함
        char[] a = new char[3];     // inputstreamreader 이용하면 byte 대신 char 이용 가능
        isr.read(a);

        System.out.println(a);
    }
}
