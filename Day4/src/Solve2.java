// 10 미만의 자연수에서 3과 5의 배수를 구하면 3, 5, 6, 9이다. 이들의 총합은 23이다.
// 그렇다면 1000 미만의 자연수에서 3과 5의 배수의 총합을 구하라.

// 1) 1~999까지 출력하는 것을 확인
// 2) 3과 5의 배수를 구하는 방법 찾기

public class Solve2 {
    public static void main(String[] args) {
        int result = 0;
        for (int n =1; n < 1000; n++) {
            if (n % 3 == 0 || n % 5 == 0) {
                result += n;
            }
        }
        System.out.println(result);
    }
}

