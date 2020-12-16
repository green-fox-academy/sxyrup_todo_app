package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        return todos.stream().map(Todo::toString).collect(Collectors.joining("\n"));
    }
}
