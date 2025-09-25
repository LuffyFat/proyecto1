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

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();
        while (true) {

            menu.showMenu();
            int txt = scanner.nextInt();
            scanner.nextLine();

            switch(txt) {
                case 1 -> {

                }
                case 2 -> {
                    System.out.println("Introduce la ruta del archivo que quieres leer");
                    String route = scanner.nextLine();
                    File file = new File(route);

                    ReadFile.readFile(file);

                    System.out.println();
                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {
                    System.out.print("Ruta del directorio: ");
                    String route = scanner.nextLine();
                    File directory = new File(route);

                    System.out.print("Nombre del archivo a buscar: ");
                    String fileName = scanner.nextLine();
                    File search = new File(directory, fileName);

                    boolean exists = ComprobarArchivo.checkFiles(directory, search);
                    System.out.println("¿Existe el archivo en el directorio?: " + exists);
                    System.out.println();
                }
                case 6 -> {

                }

            }

        }




    }
}