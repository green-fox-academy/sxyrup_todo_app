package com.greenfoxacademy;

public class TodoApp {
    private TodoList list;

    public TodoApp() {
        this.list = new TodoList();
        list.addNew("BUY MILK");
    }

    void list() {
        System.out.println(list);
    }
}
