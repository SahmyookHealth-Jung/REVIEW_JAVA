import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원의 중심을 나타내는 한 점과 반지름을 입력하시오 >> ");
        int rx = sc.nextInt();
        int ry = sc.nextInt();
        double radius = sc.nextFloat();
        System.out.print("점 입력 >> ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        double distance = Math.sqrt((x-rx)*(x-rx)+(y-ry)*(y-ry));
        if (distance <= radius) {
            System.out.println("점은 (" + x + ", " + y + ")"+ "는 원 안에 있다.");
        } else {
            System.out.println("점은 원 안에 없다.");
        }

    }
}
