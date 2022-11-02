package todo;

import static org.junit.Assert.*;
import org.junit.Test;

public class TodoTest {
  @Test public void testStartsWithEmptyTodo() {
    Todo todo = new Todo();
    assertTrue("todo list is empty", todo.getTasks().isEmpty());
  }

  @Test public void testAddsTaskToTodo() {
    Todo todo = new Todo();
    todo.addTask("Do dishes");
    todo.addTask("Walk dog");
    assertEquals("shows first task in list", "Do dishes", todo.getTasks().get(0));
    assertEquals("shows second task in list", "Walk dog", todo.getTasks().get(1));
  }
}
