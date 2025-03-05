// Scanner 를 이용해서 원화를 달러로 바꾸기

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("원화를 입력하세요: ");
        int s = sc.nextInt();

        double total = s / 1100.0;
        System.out.println(s+"원은" + " $" + total + " 입니다.");
    }
}