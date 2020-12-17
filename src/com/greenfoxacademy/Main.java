package com.greenfoxacademy;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class Main {
  public static void main(String[] args) {
    TodoApp app = new TodoApp();
    ArgHandler argHandler = new ArgHandler(app);
    try {
      argHandler.parse(args); // TODO: CATCH INDEX OUT OF BOUNDS e,  /NUMBER FORMAT EXCEPTION (REMOVE, COMPLETE..)
    } catch (NoSuchFileException n) {
      System.out.println("no such file");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
