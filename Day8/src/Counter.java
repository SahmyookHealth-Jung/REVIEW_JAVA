// 리스트에서 2, 3, 5 의 배수 개수를 계산하고 출력

import java.util.List;

public class Counter {
    private int count2 = 0;
    private int count3 = 0;
    private int count5 = 0;

    public void count(List<Integer> numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                count2++;
            }
            if (num % 3 == 0) {
                count3++;
            }
            if (num % 5 == 0) {
                count5++;
            }
        }
    }
    public void printCounts() {
        System.out.println("2의 배수 개수: " + count2);
        System.out.println("3의 배수 개수: " + count3);
        System.out.println("5의 배수 개수: " + count5);
    }
}