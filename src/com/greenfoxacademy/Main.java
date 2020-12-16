package com.greenfoxacademy;

public class Main {
    public static void main(String[] args) {
        TodoApp app = new TodoApp();
        ArgHandler argHandler = new ArgHandler(app);
        argHandler.parse(args);
    }
}
