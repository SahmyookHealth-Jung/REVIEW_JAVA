import java.util.List;

public class ResultPrint {
    public void printNumbers(List<Integer> numbers) {
        System.out.println("\n생성된 숫자 (5개씩 출력): ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+ " ");
            if ((i+1) % 5 == 0) {
                System.out.println();       // 5개씩 줄바꿈 코드!!
            }
        }
    }
}
