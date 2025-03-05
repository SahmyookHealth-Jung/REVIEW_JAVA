import java.util.Scanner;

public class Game369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("3~99 사이의 정수를 입력하시오>> ");
        int n = sc.nextInt();
        int count = 0;

        if (n / 10 == 3 || n / 10 == 6 || n / 10 == 9 ) {
            count++;
        }
        if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
            count++;
        }
        if (count == 0) {
            System.out.println(n);
        } else {                                // System.out.println("박수" + "짝".repeat(count)); // count만큼 짝을 반복 이렇게 해서 코드 간결화 가능
            if (count == 1) {
                System.out.println("박수짝");
            }
            else {
                System.out.println("박수짝짝");
            }
        }
        sc.close();
    }
}

