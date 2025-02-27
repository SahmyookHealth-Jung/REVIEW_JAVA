// 자릿수 구하기

// 25를 10으로 나누면 (나누기 1회) 2가 되고, 다시 2를 10으로 나누면 (나누기 2회) 0이 된다.

public class Solve4 {
    static int getDigitCount(int n) {
        int count = 0;
        while (true)  {
            if (n == 0) {
                break;
            }
            n = n / 10;
            count++;
        }
        return count;
    }
    public static void main (String[] args) {
        System.out.println(getDigitCount(3));
        System.out.println(getDigitCount(25));
        System.out.println(getDigitCount(242));
        System.out.println(getDigitCount(8832));

    }
}
