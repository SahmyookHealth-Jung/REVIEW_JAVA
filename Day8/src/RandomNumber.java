// 0~9사이 임의의 숫자 50개를 생성해서 2의 배수 개수, 3의 배수의 개수, 5의 배수의 개수를 콘솔에 출력하는 프로그램을 작성하시오.
// 2의 배수의 개수, 3의 배수의 개수, 5의 배수의 개수를 출력한 뒤 50개 생성된 숫자를 5개씩 끊어서 출력해야 함
// 3개 이상의 클래스 사용

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class RandomNumber{
    private List<Integer> numbers;

    public RandomNumber() {
        numbers = new ArrayList<>();
    }

    public void generateNumbers(int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(10));
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
