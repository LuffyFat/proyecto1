import java.io.File;
import java.nio.file.Files;

import java.util.Scanner;

class Menu {
     String menu =   "******************************\n" +
                    " |  -  Elige una opción  -  | \n" +
                    " |  1. Crea un directorio   | \n" +
                    " |  2. Lee un archivo       | \n" +
                    " |  3. Escribir contenido   | \n" +
                    " |  4. Eliminar archivo/dir | \n" +
                    " |  5. Comprobar si un      | \n" +
                    " |    archivo/dir existe    | \n" +
                    " |  6. Listar contenido dir | \n";

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
        Menu menu = new Menu();
        while (true) {

            menu.showMenu();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Dime un directorio");
            String directorio = scanner.nextLine();

        }




    }
}