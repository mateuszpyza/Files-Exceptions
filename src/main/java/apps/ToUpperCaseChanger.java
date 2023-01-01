package apps;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ToUpperCaseChanger {
    public static void main(String[] args) {
        readToUpperCaseAndSave("C:\\Users\\pyzio\\OneDrive\\Pulpit\\Java_Projekty\\wyklad2Metody\\Files-Exceptions\\src\\main\\resources\\data.txt",
                "C:\\Users\\pyzio\\OneDrive\\Pulpit\\Java_Projekty\\wyklad2Metody\\Files-Exceptions\\src\\main\\resources\\output.txt");
    }

    public static boolean readToUpperCaseAndSave(String pathToRead, String pathToSave) {
        return saveToFile(readFile(pathToRead).toUpperCase(), pathToSave);
    }

    public static String readFile(String pathToFile) {
        try {
            return Files.readString(Path.of(pathToFile));
        } catch (IOException e) {
            throw new RuntimeException("Problems with reading file");
        }
    }

    public static boolean saveToFile(String dataToSave, String pathToFile) {
        try {
            File output = new File(pathToFile);
            output.createNewFile();
            Files.write(Path.of(pathToFile), (dataToSave).getBytes());
            return true;
        } catch (IOException e) {
            throw new RuntimeException("File creation problem!");
        }
    }
}

