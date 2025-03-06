import java.util.ArrayList;

public class TodoManager {
    private ArrayList<Todo> todolist = new ArrayList<>(); // 할 일 저장소
    private int nextId = 1;

    public void addTodo(String description) {
        Todo newTodo = new Todo(nextId++, description);
        todolist.add(newTodo);
        System.out.println("추가 완료" + description);
    }

    public void removeTodo(int id) {
        boolean removed = todolist.removeIf(todo -> todo.getId() == id);
        if (removed) {
            System.out.println("삭제 완료");
        } else {
            System.out.println("해당 ID를 찾을 수 없음!");
        }
    }

    public void listTodos() {
        if (todolist.isEmpty()) {
            System.out.println("할 일이 없습니다!");
        } else {
            for (Todo todo : todolist) {
                System.out.println(todo);
            }
        }
    }
}
