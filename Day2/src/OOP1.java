// 객체를 사용하면 계산기 수가 늘어나더라도 객체만 생성을 하면 되기 때문에 매우 간단해진다.

class Calculator {
    int result = 0;

    int add (int num) {
        result += num;
        return result;
    }

    int sub(int num) {
        result -= num;
        return result;
    }
}

public class OOP1 {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator(); // 계산기1 객체를 생성
        Calculator cal2 = new Calculator(); // 계산기2 객체를 생성

        System.out.println(cal1.add(3));
        System.out.println(cal1.sub(4));
        System.out.println(cal2.add(3));
        System.out.println(cal2.add(4));


    }
}
