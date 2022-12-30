package models;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {
    public static String reedFile(String pathToFile) {
        try {
            return Files.readString(Path.of(pathToFile));
        } catch (IOException e) {
            throw new RuntimeException("Problems with reading file");
        }
    }
}
