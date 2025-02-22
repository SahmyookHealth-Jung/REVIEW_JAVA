import java.util.ArrayList;
import java.util.Arrays;

public class For_Practice1 {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three", "four", "five"};
        for(String number : numbers) {      // for (type 변수명 : iterate) { } iterate -> 루프를 돌릴 객체
            System.out.println(number);
        }
        ArrayList<String> num = new ArrayList<String>(Arrays.asList("one", "two", "three", "four", "five"));
        for(String nums : num) {
            System.out.println(nums);
        }
    }
}
