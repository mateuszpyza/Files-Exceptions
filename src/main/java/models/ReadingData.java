package models;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingData {
    public static void main(String[] args) {
        reedFile();
    }

    public static void reedFile() {
        String dataPath = "C:\\Users\\pyzio\\OneDrive\\Pulpit\\Java_Projekty\\wyklad2Metody\\Files-Exceptions\\src\\main\\resources\\data.txt";
        File data = new File(dataPath);
        if (data.exists()) {
            try {
                System.out.println(Files.readString(Path.of(dataPath)));
            } catch (IOException e) {
                System.out.println("Problems with reading file");
            }
        }
    }
}
