// 화폐 개수 반환하기

import java.util.Scanner;

public class CheckMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("금액을 입력하시오: ");
        int amount = sc.nextInt();

        int[] units = {50000, 10000, 1000, 100, 50, 10, 1};
        String[] unitNames = {"오만원권", "만원권", "천원권", "백원", "오십원", "십원", "일원"};

        for (int i = 0; i < units.length; i++) {
            int count = amount / units[i]; // 화폐 개수 (큰 단위부터 나눠서 처리)
            amount %= units[i]; // 남은 금액 계산

            if (count > 0) {
                System.out.println(unitNames[i] + " " + count);
            }
        }
        sc.close();
    }
}
