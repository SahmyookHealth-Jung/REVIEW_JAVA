// 중간값 찾기 코드 (처음에 내가 시도해봤던 코드)
// 너무 복잡하고 if문을 남발한 느낌의 코드로 보여서 수정이 필요

import java.util.Scanner;

public class MediumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 3개 입력>> ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        if (n > m) {
            if (k>n) {
                System.out.println(n);
            }
        } else if (m > n) {
            if (k>m) {
                System.out.println(m);
            }
        } else {
            if (k > n) {
                if (m > k) {
                    System.out.println(k);
                }
            }
        }
    }
}
