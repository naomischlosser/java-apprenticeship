package todo;

import java.util.ArrayList;

public class Todo {
  ArrayList<String> tasks = new ArrayList<String>();

  public void addTask(String task) {
    tasks.add(task);
  }

  public ArrayList<String> getTasks() {
    return tasks;
  }
}