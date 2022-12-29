package models;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingData {
    public static void main(String[] args) {

        writeEveryOtherLine(reedFile());

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

    public static void writeEveryOtherLine(String text) {
        int startIndex = 0;
        int endIndex = 0;
        int counter = 0;
        while (endIndex != -1) {
            startIndex = text.indexOf("\n", startIndex);
            endIndex = text.indexOf("\n", startIndex + 1);
            if(endIndex==-1){
                endIndex=text.length();
                System.out.println(text.substring(startIndex, endIndex));
                break;
            }
            if (counter % 2 == 0) {
                System.out.println(text.substring(startIndex, endIndex + 1));
            }
            counter = counter + 1;
            startIndex = startIndex + 1;
        }
    }
}
