// 객체 지향
// 계산기가 3, 5, 10개 로 점점 더 많이 필요해진다면 어떻게 해야할까?
// 그때마다 클래스 추가하기 -> 코드가 너무 복잡해진다.

class Calculator1 {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}

class Calculator2 {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}

public class OOP {
    public static void main(String[] args) {
    System.out.println(Calculator1.add(5));
    System.out.println(Calculator1.add(6));

    System.out.println(Calculator2.add(5));
    System.out.println(Calculator2.add(7));
    }
}