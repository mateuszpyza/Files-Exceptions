package models;

public class WordInFile {
    public static boolean containWord(String pathToFile, String word) {
        if (word != null) {
            return FileReader.reedFile(pathToFile).contains(word);
        } else {
            throw new RuntimeException("Problems with input data!");
        }
    }
}
