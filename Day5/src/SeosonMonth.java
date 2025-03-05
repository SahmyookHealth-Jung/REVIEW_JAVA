import java.util.Scanner;

public class SeosonMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("달을 입력하시오(1~12) >> ");
        int month = sc.nextInt();
        switch (month) {
            case 1,2,12:
                System.out.println("겨울");
                break;
            case 3,4,5:
                System.out.println("봄");
                break;
            case 6,7,8:
                System.out.println("여름");
                break;
            case 9,10,11:
                System.out.println("가을");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
        sc.close();
    }
}
