package models;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingData {
    public static void main(String[] args) {
        System.out.println(containsWord(reedFile(), "Wyjątki"));


    }

    public static String reedFile() {
        String dataPath = "C:\\Users\\pyzio\\OneDrive\\Pulpit\\Java_Projekty\\wyklad2Metody\\Files-Exceptions\\src\\main\\resources\\data.txt";
        File data = new File(dataPath);
        if (data.exists()) {
            try {
                return Files.readString(Path.of(dataPath));
            } catch (IOException e) {
                System.out.println("Problems with reading file");
            }
        }
        return "Problems with reading file";
    }

    public static boolean containsWord(String text, String searchedWord) {
        if (text != null && searchedWord != null) {
            return text.contains(searchedWord);
        }
        return false;
    }
}
