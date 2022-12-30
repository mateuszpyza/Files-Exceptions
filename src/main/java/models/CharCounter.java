package models;

public class CharCounter {

    public static void countCharInText(String pathToFile) {
        System.out.println("Plik zawiera " + FileReader.reedFile(pathToFile).length() + " znaków");
    }
}
