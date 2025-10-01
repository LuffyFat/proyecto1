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
                    System.out.println("Que quieres crear");
                    System.out.println("***********");
                    System.out.println("[1]Directorio");
                    System.out.println("[2]Archivo");
                    System.out.println("***********");
                    int a = sc.nextInt();
                    CrearArchivoDirectorio.crearArchivoDirectorio(a);
                }
                case 2 -> {
                    System.out.println("Introduce la ruta del archivo que quieres leer");
                    File file = new File(scanner.nextLine());
                    ReadFile.readFile(file);
                    System.out.println();
                }
                case 3 -> {
                     System.out.println("Introduce la ruta del archivo en el que quieres añadir algo: ");
                     EscribirArchivo.writeToAnExistingFile(new File(Scanner.nextLine()));
                     System.out.println();
                }
                case 4 -> {
                     System.out.println("Introduce la ruta del archivo que quieras eliminar: ");
                     EliminarArchivoDirectorio.deleteFileDirectory(new File(Scanner.nextLine()));
                     System.out.println();
                }
                case 5 -> {
                    System.out.print("Ruta del directorio: ");
                    File directory = new File(scanner.nextLine());

                    System.out.print("Nombre del archivo a buscar: ");
                    File search = new File(directory, scanner.nextLine());

                    boolean exists = ComprobarArchivo.checkFiles(directory, search);
                    System.out.println("¿Existe el archivo en el directorio?: " + exists);
                    System.out.println();
                }
                case 6 -> {
                     String ruta = "";
                     do{
                         try{
                              System.out.println("\n---------------------");
                              System.out.println("Introduce una ruta");
                              System.out.println("\n---------------------");
                              System.out.println("Ruta: ");

                              ruta = scanner.nextLine();

                              if(!ruta.equals("")){
                                   File fitxer = new File(ruta);
                                   ListContent.mostraRuta(fitxer);
                              }

                         }catch (FileNotFoundException e){
                              System.err.println(e);
                         }
                    }while (!ruta.equals(""));
                              }

            }

        }




    }
}
