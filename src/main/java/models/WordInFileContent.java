package models;

public class WordInFileContent {
    public static boolean containWord(String pathToFile, String word) {
        if (word != null) {
            return FileReader.readFile(pathToFile).contains(word);
        } else {
            throw new RuntimeException("Problems with input data!");
        }
    }
}