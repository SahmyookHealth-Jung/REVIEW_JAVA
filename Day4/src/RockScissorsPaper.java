import java.util.Scanner;

public class RockScissorsPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 플레이어의 이름을 입력하세요:");
        String n1 = sc.next();

        System.out.println("두 번째 플레이어 이름을 입력하세요:");
        String n2 = sc.next();

        System.out.println(n1 + " >> ");
        String c1 = sc.next();
        System.out.println(n2 + " >> ");
        String c2 = sc.next();

        if (c1.equals(c2)) {
            System.out.println("비겼습니다");
        } else if (
            (c1.equals("가위") && c2.equals("보")) || (c1.equals("바위")&&c2.equals("가위")) ||
                    (c1.equals("보") && c2.equals("바위"))) {
            System.out.print(n1 + "가 이겼습니다");
        } else {
            System.out.println(n2 +"가 이겼습니다.");
        }
        sc.close();
    }
}
