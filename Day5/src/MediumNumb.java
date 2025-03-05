import java.util.Scanner;

public class MediumNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("3개의 정수 입력>> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int mid;

        if (a>b && a<c || a<b && a>c) {
            mid = a;
        } else if (b>a && b<c || b<a && b>c) {
            mid = b;
        } else {
            mid = c;
        }
        System.out.println("중간 값은 " + mid);
        sc.close();
    }
}
