public class mtd2 {
    void sayNick(String nick) {
        if ("바보".equals(nick)) {
            return;         // 바보 라는 값이 들어오면 문자열을 출력하지 않고 메서드를 빠져나감.
        }
        System.out.println("나의 별명은 " + nick + "입니다.");
    }
    public static void main(String[] args) {
        mtd2 mtd = new mtd2();
        mtd.sayNick("야호");
        mtd.sayNick("바보");
    }
}
