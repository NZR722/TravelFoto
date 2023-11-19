package org.example;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StorageManager storageManager = new StorageManager();
        String note = "\nтестовая запись 5";
        storageManager.write(note);
        storageManager.read();
    }


//ToDo создать и записать
//ToDo читать и отображать
//ToDo удалять
//ToDo редактировать
}