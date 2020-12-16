package com.greenfoxacademy;

public class ArgHandler {
    private TodoApp app;

    public ArgHandler(TodoApp app) {
        this.app = app;
    }

    void parse(String[] args) {
        if (args.length == 0) {
            System.out.println(
                    "Parancssori Todo applikáció \n" +
                            "============================= \n" +
                            "Parancssori argumentumok:\n" +
                            "\t-l Kilistázza a feladatokat\n" +
                            "\t-a Új feladatot ad hozzá\n" +
                            "\t-r Eltávolít egy feladatot\n" +
                            "\t-c Teljesít egy feladatot\n"
            );
        } else if (args.length == 1 && args[0].equals("-l")) {
            app.list();
        }

    }
}
