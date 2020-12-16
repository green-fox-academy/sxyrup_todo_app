package com.greenfoxacademy;

import java.io.Serializable;

public class Todo implements Serializable {
    private int id; //ToDo getID > Files.lines(Paths.get(path)).count()
    private String description;
    private boolean isDone;

    public Todo(String description) {
        this.description = description;
        this.isDone = false;
    }

    void complete() {
        this.isDone = true;
    }

    @Override
    public String toString() {
        return id + ". " + (isDone ? " [X] " : " [ ] ") + description;
    }
}
