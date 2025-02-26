interface Predator {
   String getFood();

   default void printFood() {
      System.out.printf("my food is %s\n", getFood());
   }
}

//abstract class Predator extends Animal {       // 추상 클래스 - 객체 생성 불가
//    abstract String getFood();

//    void printFood() {
//        System.out.printf("my food is %s\n", getFood());
//    }
//}

interface Barkable {
    void bark();
}

interface BarkablePredator extends Predator , Barkable {
}

class Animals {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tigers extends Animals implements BarkablePredator {
    public String getFood() {
        return "apples";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lions extends Animals implements Predator, Barkable {
    public String getFood() {
        return "bananas";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}

class ZooKeepers {
    void feed (Predator predator) {         // Tigers 클래스의 객체이자 Predator 인터페이스의 객체
        System.out.println("feed "+predator.getFood());
    }
}

//  ZooKeeper 클래스가 동물 클래스에 의존적인 클래스에서
//  동물 클래스와 상관없는 독립적인 클래스가 되었다는 점이다.
//  인터페이스는 인터페이스 메서드를 반드시 구현해야 하는 강제성을 갖는다.

//  다중 구현이 가능하고 다중 기능 추가가 가능하다는 장점이 있다

class Bouncer {
    void barkAnimal (Barkable animal) {
        animal.bark();
    }
}