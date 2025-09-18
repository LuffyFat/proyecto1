import java.io.File;
import java.nio.file.Files;

import java.util.Scanner;

class Menu {
    String menu =   "******************************" +
                    " |  -  Elige una opción  -  | " +
                    " |  1. Crea un directorio   | " +
                    " |  2. Lee un archivo       | " +
                    " |  3. Escribir contenido   | " +
                    " |  4. Eliminar archivo/dir | " +
                    " |  5. Comprobar si un      | " +
                    " |    archivo/dir existe    | " +
                    " |  6. Listar contenido dir | ";

    void showMenu() {
        System.out.println(menu);
    }

    static void deleteFileAndDirectory(File f){
        if (f.exists() && f.delete()){
            System.out.println("Archivo eliminado correctamente: " + f);
        } else {
            System.out.println("No se pudo eliminar el archivo: " + f);
        }
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un directorio");
        String directorio = scanner.nextLine();



    }
}