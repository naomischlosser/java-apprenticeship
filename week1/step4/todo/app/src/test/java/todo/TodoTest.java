package todo;

import static org.junit.Assert.*;
import org.junit.Test;

public class TodoTest {
  @Test public void testStartsWithEmptyTodo() {
    Todo todo = new Todo();
    assertTrue("todo list is empty", todo.getTasks().isEmpty());
  }
}
