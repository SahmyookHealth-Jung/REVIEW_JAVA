//리턴값이 없는 메서드

public class Mtd {
    void sum(int a, int b){
        System.out.println(a+"과 " +b+ "의 합은 " + (a+b)+"입니다.");
        // system.out.println 문은 메서드 내에서 사용되는 문장일 뿐 리턴값은 없다.
    }
    public static void main(String[] args) {
        Mtd mtd = new Mtd();
        mtd.sum(3,5);
    }
}
