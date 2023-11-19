package org.example;

import java.io.*;
import java.io.FileReader;
import java.io.IOException;



public class StorageManager {


    public StorageManager() throws IOException {

    }

    public void read() throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("E:\\Курсовая\\Программирование Java\\example.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line); // Выводим строки из файла на консоль
        }
        bufferedReader.close();
    }

    public void write(String note) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("E:\\Курсовая\\Программирование Java\\example.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String data = note;
            bufferedWriter.write(data);

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
