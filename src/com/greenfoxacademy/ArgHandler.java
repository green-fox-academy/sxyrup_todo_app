package com.greenfoxacademy;

public class ArgHandler {
    static void parse(String[] args) {
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
        }

    }
}
