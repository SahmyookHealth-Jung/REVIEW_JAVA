public class Main {
    public static void main(String[] args) {
        RandomNumber ran = new RandomNumber();
        ran.generateNumbers(50);

        Counter c = new Counter();
        c.count(ran.getNumbers());

        ResultPrint prints = new ResultPrint();

        c.printCounts();        // 2,3,5 의 배수 개수 출력
        prints.printNumbers(ran.getNumbers());  // 5개씩 끊은 수 출력
    }
}
