package models;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingData {
    public static void main(String[] args) {
        reversText(reedFile());

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

    public static void reversText(String text) {
        int j = 0;
        char[] reverseText = text.toCharArray();
        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText[j] = text.toCharArray()[i];
            j++;
        }
        System.out.println(reverseText);
    }
}
