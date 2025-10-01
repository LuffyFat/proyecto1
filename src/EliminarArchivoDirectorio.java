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



}
