import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class Main {
    public static void main(String[] args) {
        TodoManager todoManager = new TodoManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("할 일 입력하기: ");
            System.out.println("1. 할 일 추가 | 2. 삭제 | 3. 목록 보기 | 4. 종료");
            System.out.print("선택: ");

            int choice = sc.nextInt();
            sc.nextLine();      // nextInt 사용 후 버퍼 비우기는 반드시 필요

            switch (choice) {
                case 1:
                    System.out.print("추가할 할 일 입력 >> " );
                    String task = sc.nextLine();
                    todoManager.addTodo(task);
                    break;
                case 2:
                    System.out.print("삭제할 ID 입력 >> ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    todoManager.removeTodo(id);
                    break;
                case 3:
                    System.out.print("보고 싶은 목록 선택 >> ");
                    todoManager.listTodos();
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다. ");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요~!");
                    break;
            }
        }
    }
}
