public class While_Continue {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10) {
            a++;
            if (a%2 == 0) {
                continue;
            }
            else {
                System.out.println(a);
            }
        }
    }
}
