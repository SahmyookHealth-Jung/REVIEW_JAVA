
public class Todo {

    private int id;     // 할 일의 고유 ID
    private String description; // 할 일의 내용
    private boolean completed;  // 완료 여부

    // 생성자 (할 일 생성 시 id와 내용 입력)
    public Todo(int id, String description) {
        this.id = id;
        this.description = description;
        this.completed = false; // 처음엔 완료되지 않은 상태
    }

    // 완료 처리
    public void asDone() {
        this.completed = true;
    }

    // ID 가져오기
    public int getId() {
        return id;
    }

    public String toString() {
        return "[" + (completed ? "COMPLETED" : "NOT COMPLETED") + "] " + description;      // ? : 삼항 연산자 complete가 true이면 completed 아니면 not completed
    }
}