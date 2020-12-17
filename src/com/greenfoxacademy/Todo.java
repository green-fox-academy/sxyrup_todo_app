package com.greenfoxacademy;

import java.io.Serializable;

public class Todo implements Serializable {
  private final String DESCRIPTION;
  private boolean isDone;

  public Todo(String description) {
    this.DESCRIPTION = description;
    this.isDone = false;
  }

  void complete() {
    this.isDone = true;
  }

  @Override
  public String toString() {
    return (isDone ? " [X] " : " [ ] ") + DESCRIPTION;
  }
}
