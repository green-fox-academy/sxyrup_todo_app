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

  public boolean isDone() {
    return isDone;
  }

  @Override
  public String toString() {
    return (isDone ? " [X] " : " [ ] ") + DESCRIPTION;
  }
}
