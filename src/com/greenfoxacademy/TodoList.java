package com.greenfoxacademy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class TodoList implements Serializable { // implements SERIALIZABLE
  private List<Todo> todos;

  public TodoList(ArrayList<Todo> todos) {
    this.todos = todos;
  }

  public TodoList() {
    this(new ArrayList<>());
  }

  void addNew(String description) {
    todos.add(new Todo(description));
  }

  void remove(int id) throws IndexOutOfBoundsException {
    todos.remove(id - 1);
  }

  void complete(int id) throws IndexOutOfBoundsException {
    todos.get(id - 1).complete();
  }

  int count() {
    return todos.size();
  }

  @Override
  public String toString() {
    String t = "";
    for (int i = 0; i < todos.size(); i++) {
      t += (i + 1) + ". " + todos.get(i) + "\n";
    }
    return t;
  }
}
