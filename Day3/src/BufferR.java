import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferR {
    public static void main(String[] args) throws IOException {
        InputStream in  = System.in;
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);

        String a = br.readLine();
        System.out.println(a);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
    }
}
