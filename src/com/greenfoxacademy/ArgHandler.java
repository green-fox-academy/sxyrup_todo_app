package com.greenfoxacademy;

import java.io.IOException;

public class ArgHandler {
  private TodoApp app;

  public ArgHandler(TodoApp app) {
    this.app = app;
  }

  private final String MAN = "Parancssori Todo applikáció \n" +
      "============================= \n" +
      "Parancssori argumentumok:\n" +
      "\t-l Kilistázza a feladatokat\n" +
      "\t-a Új feladatot ad hozzá\n" +
      "\t-r Eltávolít egy feladatot\n" +
      "\t-c Teljesít egy feladatot\n";

  void parse(String[] args) throws IOException {
    if (args.length == 0) {
      System.out.println(MAN);
    } else if (args.length == 1) {
      if (args[0].equals("-l")) {
        app.list();
      } else if (args[0].equals("-c")) {
        System.out.println("Nem lehetséges a feladat végrehajtása: nem adtál meg indexet!");
      } else if (args[0].equals("-r")) {
        System.out.println("Nem lehetséges a feladat végrehajtása: nem adtál meg indexet!");
      } else if (args[0].equals("-a")) {
        System.out.println("Nem lehetséges új feladat hozzáadása: nincs megadva a feladat!");
      }
    } else if (args.length == 2) {
      if (args[0].equals("-a")) {
        app.addNew(args[1]);
      } else if (args[0].equals("-r")) {
        app.remove(Integer.parseInt(args[1]));
      } else if (args[0].equals("-c")) {
        app.complete(Integer.parseInt(args[1]));
      }
    } else {
      System.out.println("Nem tamogatott argumentum!\n");
      System.out.println(MAN);
    }
  }
}
