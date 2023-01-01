package models;

public class Main {
    public static void main(String[] args) {
        TextReverser.reversText(FileReader.readFile("C:\\Users\\pyzio\\OneDrive\\Pulpit\\Java_Projekty\\wyklad2Metody\\Files-Exceptions\\src\\main\\resources\\data.txt"));
        TextReverser.reversText(null);
    }
}
