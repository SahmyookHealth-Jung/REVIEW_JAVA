import java.util.ArrayList;

public class ContainsTest {
    public static void main(String[] args) {
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("handphone");
        pocket.add("money");

        if (pocket.contains("paper")) {
            System.out.println("택시를 타고 가라");
        }
        else {
            System.out.println("걸어가라");
        }
        //else-if 연습
        boolean hasCard = true;
        ArrayList<String> pockets = new ArrayList<String>();
        pockets.add("paper");
        pockets.add("handphone");

        if (pockets.contains("money")) {
            System.out.println("택시를 타고 가라");
        }
        else if (hasCard) {
            System.out.println("택시를 타고 가라");
        }
        else {
            System.out.println("걸어가라");
        }
    }
}
