class Updater{
    void update(Counter counter) {
        counter.count++;
    }
}

class Counter{
    int count = 0;
}

public class Mtd4 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println("이전 업데이트:"+counter.count);
        Updater updater = new Updater();
        updater.update(counter);
        System.out.println("이후 업데이트"+counter.count);
    }
}
