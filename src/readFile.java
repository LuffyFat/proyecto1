import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {

    static void readFile(File file ){
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String route = scanner.nextLine();
        File file = new File(route);

        readFile(file);

    }
}