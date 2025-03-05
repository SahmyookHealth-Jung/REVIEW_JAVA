import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산 >>");
        double num1,num2,result;
        String a;

        num1 = sc.nextDouble();
        a = sc.next();
        num2 = sc.nextDouble();

        switch (a){
            case "+":
                result = num1 + num2;
                System.out.println(result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println(result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    result = num1 / num2;
                    System.out.println(result);
                }
                break;
                default:
        }
        sc.close();
    }
}
