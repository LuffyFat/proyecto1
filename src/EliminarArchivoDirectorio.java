import java.io.File;

import java.util.Scanner;

public class EliminarArchivoDirectorio {

    public static void deleteFileDirectory(File f){
        if (f.exists() && f.delete()){
            System.out.println("Archivo eliminado correctamente: " + f);
        } else {
            System.out.println("No se pudo eliminar el archivo: " + f);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un directorio");
        String directorio = scanner.nextLine();


    }
}