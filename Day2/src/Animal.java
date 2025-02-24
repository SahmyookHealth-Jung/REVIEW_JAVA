// Animal dog = new Dog(); - 가능
// Dog 로 만든 객체는 Animal 의 자료형이다.

class Animal {
    String name; // 객체 변수 - 클래스에 의해 선언된 변수

    public void setName(String name) {
        this.name = name;  // name 의 객체 변수는 공유되지 않는다.
    }
}

class Dog extends Animal {
    Dog() {

    }
    // extends - 상속을 위한 키워드
    // Dog 클래스는 Animal 클래스를 상속하게 되었다.
    void sleep() {      // sleep 메서드를 추가하여 Animal 클래스보다 좀 더 많은 기능을 가지게 되었다.
        System.out.println(this.name+ " zzz");
    }
}

// 메서드 오버라이딩 (메서드 덮어쓰기)
// 부모 클래스의 메서드를 자식 클래스가 동일한 형태로 또 다시 구현하는 행위

class HouseDog extends Dog {
    HouseDog(String name) {
        this.setName(name);
    }
    HouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        }
        else if (type == 2) {
            this.setName("Dog2");
        }
    }
    void sleep(int hour) {
        System.out.println(this.name+ " zzz in my house for " + hour + " hours");
    }
}





