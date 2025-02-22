//  자바에서 무한 루프는 while 문으로 구현할 수 있다.  while (true)
// 우리가 사용하는 프로그램 중에서는 무한 루프의 개념을 사용하지 않는 프로그램은 거의 없다.

public class While_Practice {
    public static void main(String[] args) {
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit++;
            System.out.println("나무를 " + treeHit + "번 찍었습니다.");
            if (treeHit == 10) {
                System.out.println("나무 넘어갑니다!");
            }
        }
    }
}
