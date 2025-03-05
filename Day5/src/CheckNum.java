// 10의 자리와 1의 자리가 같은지 비교

import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("2자리 정수 입력(10~99): ");
        int n = sc.nextInt();

        int ten = n / 10 ;
        int ones = n % 10 ;

        if ( ten == ones ) {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        } else {
            System.out.println("10의 자리와 1의 자리가 다릅니다.");
        }
    }
}
