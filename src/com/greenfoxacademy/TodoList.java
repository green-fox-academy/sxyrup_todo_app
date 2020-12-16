package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.List;


public class TodoList {
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

    @Override
    public String toString() {
        String t = "";
        for (int i = 0; i < todos.size(); i++) {
            t += (i + 1) + ". " + todos.get(i) + "\n";
        }
        return t;
    }
}
