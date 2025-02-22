public class For_practice {
    public static void main(String[] args) {
        int[] score = {90,25,67,45,80};
        for (int i=0; i<score.length; i++) {
            if (score[i] >= 60) {
                System.out.println("합격입니다");
            }
            else {
                System.out.println("불합격입니다.");
            }
        }

        // continue를 사용해서 합격자에게만 메세지 보내기
        for (int i=0; i<score.length; i++) {
            if (score[i] < 60) {
                continue;
            }
            System.out.println((i+1)+"번 학생 축하합니다. 합격입니다");
        }
    }
}
