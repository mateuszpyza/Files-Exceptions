package apps;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TxtFile {
    public static void main(String[] args){
        createFileTxt();

    }

    public static void createFileTxt(){
        try {
            String resourcesPath = "C:\\Users\\pyzio\\OneDrive\\Pulpit\\Java_Projekty\\wyklad2Metody\\Files-Exceptions\\src\\main\\resources\\data.txt";
            File data = new File(resourcesPath);
            data.createNewFile();
            Files.write(Path.of(resourcesPath), ("""
                    Kurs
                    Java
                    Lekcja 6
                    Pliki
                    Wyjątki
                    Pliki
                    Koniec pliku""").getBytes());
        }catch(IOException e){
            System.out.println("File cration problem!");
        }

    }
}
