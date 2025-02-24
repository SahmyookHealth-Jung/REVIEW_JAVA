// 클래스 내의 함수를 메서드라고 부른다.
// 믹서에 과일을 넣고 주스를 만든다. (과일 - 입력 / 주스 - 출력 / 믹서 - 메서드)

// 리턴자료형 메서드명(입력자료형1 매개변수1, 입력자료형2 매개변수2, ...) {
//    ...
//    return 리턴값;
// 리턴자료형이 void 인 경우에는 return 문이 필요없다.

public class Practice_method {
    String say(){
        return "안뇽";
    }
     int sum(int a, int b) {  // a,b 는 매개변수
         return a+b;
        }
        public static void main(String[] args) {
         //int a = 3;
         //int b = 5;

         Practice_method sam = new Practice_method();
         // int c = sam.sum(a,b);
         int c = sam.sum(3,4);
         System.out.println(c);

         String d = sam.say();
         System.out.println(d);
        }
    }

