package com.greenfoxacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;

public class TodoApp {
    private TodoList list;
    private static final String FILE_PATH = "./todo.txt";


    public TodoApp() {
        this.list = new TodoList();

    }


    void list() {
        System.out.println(list);
    }

    void addNew(String description) throws IOException {
        list.addNew(description);
        Files.write(Paths.get(FILE_PATH), Collections.singleton(list.toString()), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
    }
}
