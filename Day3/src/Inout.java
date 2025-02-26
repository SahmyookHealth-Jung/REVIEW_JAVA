import java.io.IOException;
import java.io.InputStream;

public class Inout {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in; //system.in 은 inputstream 의 객체

        byte[] a = new byte[3];
        in.read(a);

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}

// 스트림
// 파일 데이터 : 시작과 끝이 있는 데이터의 스트림
// HTTP 송수신 데이터
// 키보드 입력