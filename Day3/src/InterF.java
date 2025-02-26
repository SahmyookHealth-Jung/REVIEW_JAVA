// 인터페이스는 왜 필요한가?
//

public class InterF {
    public static void main(String[] args) {
    ZooKeeper zooKeeper = new ZooKeeper();
    Tiger tiger = new Tiger();
    Lion lion = new Lion();
    zooKeeper.feed(tiger);
    zooKeeper.feed(lion);

    ZooKeepers zoo = new ZooKeepers();
    Tigers tigers = new Tigers();
    Lions lions = new Lions();
    zoo.feed(tigers);
    zoo.feed(lions);
    }
}
