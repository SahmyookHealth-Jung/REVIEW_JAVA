public class mtd3 {

    int a;

    void varTset() {
        this.a++;
    }

    public static void main(String[] args) {
        mtd3 mtd = new mtd3();
        mtd.a = 1;
        mtd.varTset();
        System.out.println(mtd.a);
    }
}
