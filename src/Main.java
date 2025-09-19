import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import java.util.Scanner;

public class Main {
    public static void writeToAnExistingFile (File file){
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(text);

            System.out.println("Texto añadido con éxito " + file);
        } catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un directorio");
        String directorio = scanner.nextLine();


    }
}