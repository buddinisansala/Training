package task3;

import java.io.*;

public class WrappedException {

    public static void main(String[] args) {
        try {
            loadFile();
        } catch (RuntimeException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }

    private static void loadFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("./text.txt");
            System.out.println("file load successfully");
        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        }
    }
}