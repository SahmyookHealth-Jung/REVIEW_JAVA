// 가위바위보 게임
// 문자열을 비교할 떄 == 을 사용하면 메모리 주소를 비교하게 된다.
// 문자열의 내용을 비교하고 싶으면 .equals()를 사용해야 함.

import java.util.Scanner;

public class Solve5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");

        System.out.print("철수 >> ");
        String cs = sc.next();

        System.out.print("영희 >> ");
        String yh = sc.next();

        if (cs.equals("가위")) {
            if (yh.equals("보")) {
                System.out.println("철수가 이겼습니다.");
            } else if (yh.equals("가위")) {
                System.out.println("비겼습니다.");
            } else {
                System.out.println("영희가 이겼습니다.");
            }
        } else if (cs.equals("바위")) {
            if (yh.equals("가위")) {
                System.out.println("철수가 이겼습니다.");
            } else if (yh.equals("바위")) {
                System.out.println("비겼습니다.");
            } else {
                System.out.println("영희가 이겼습니다.");
            }
        } else if (cs.equals("보")) {
            if (yh.equals("가위")) {
                System.out.println("영희가 이겼습니다.");
            } else if (yh.equals("바위")) {
                System.out.println("철수가 이겼습니다.");
            } else {
                System.out.println("비겼습니다.");
            }
        }
        sc.close();
    }
}
