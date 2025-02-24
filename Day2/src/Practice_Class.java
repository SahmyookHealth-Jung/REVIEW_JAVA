public class Practice_Class {
    public static void main(String[] args) {
        Animal cat = new Animal(); // cat - 객체
        cat.setName("삐약이"); // 메서드 호출

        Animal dog = new Animal();
        dog.setName("잔디");

        System.out.println(cat.name);
        System.out.println(dog.name); // 객체 변수의 값이 독립적으로 유지됩니다.

        Dog dog2 = new Dog();
        dog2.setName("금잔디");
        System.out.println(dog2.name);
        dog2.sleep();

        HouseDog hd = new HouseDog("정잔디");  // 생성자가 생성된 경우 규칙대로만 객체 생성 가능.
        HouseDog york = new HouseDog(1);
        //hd.setName("정잔디");
        //hd.sleep();
        //hd.sleep(3);
        System.out.println(hd.name);
        System.out.println(york.name);
    }
}
