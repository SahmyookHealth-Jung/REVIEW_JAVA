// 다형성
// 하나의 객체가 여러 개의 자료형 타입을 가질 수 있는 것
// 복잡한 형태의 분기문을 간단하게 처리할 수 있는 경우가 많다.

public class Poly {
    public static void main(String[] args) {
        Tigers tigers = new Tigers();
        Lions lions = new Lions();
        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tigers);
        bouncer.barkAnimal(lions);
    }
}
