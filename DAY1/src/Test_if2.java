public class Test_if2 {
    public static void main(String[] args) {
        int money = 2000;
        boolean hasCard = true;

        if (money >= 3000 || hasCard) {   //or
            System.out.println("택시를 타라");
        }
        else {
            System.out.println("걸어가라");
        }
    }
}
