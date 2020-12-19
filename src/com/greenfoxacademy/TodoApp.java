package com.greenfoxacademy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TodoApp {
  private TodoList list;
  private static final String FILE_PATH = "./todo.ser";


  public TodoApp() {
    try {
      read();
    } catch (Exception e) {
      list = new TodoList(); //IF THERE IS NO LIST, MAKE IT
    }
  }

  void list() {
    System.out.println(list.count() == 0 || list.countCompleted() == list.count()? "Nincs mara teni valod :(" : list); //for empty or completed list

  }

  void addNew(String description) throws IOException { //FUNCTION OK
    list.addNew(description);
    write();
  }

  void remove(int id) throws IndexOutOfBoundsException, IOException {
    list.remove(id);
    write();
  }

  void complete(int id) throws IndexOutOfBoundsException, IOException {
    list.complete(id);
    write();
  }

  private void read() throws IOException, ClassNotFoundException { //READS FILE OK
    FileInputStream fileIn = new FileInputStream(FILE_PATH);
    ObjectInputStream in = new ObjectInputStream(fileIn);
    list = (TodoList) in.readObject();
    in.close();
    fileIn.close();
  }

  private void write() throws IOException { //WRITES FILE, OK
    FileOutputStream fileOut = new FileOutputStream(FILE_PATH);
    ObjectOutputStream out = new ObjectOutputStream(fileOut);
    out.writeObject(list);
    out.close();
    fileOut.close();

  }

}
