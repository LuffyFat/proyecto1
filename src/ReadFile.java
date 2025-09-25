import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void readFile(File file ){
        try(Scanner fileReader = new Scanner(file)){
            while (fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                System.out.println(data);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("El archivo no se ha encontrado.");
        }
    }
}