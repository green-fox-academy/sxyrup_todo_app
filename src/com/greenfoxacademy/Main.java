package com.greenfoxacademy;

import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    TodoApp app = new TodoApp();
    ArgHandler argHandler = new ArgHandler(app);
    try {
      argHandler.parse(args);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (NumberFormatException e) {
      System.out.println("Nem lehetséges az eltávolítás: a megadott index nem szám!");
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Nem lehetséges az eltávolítás: túlindexelési probléma adódott!");
    }
  }
}
