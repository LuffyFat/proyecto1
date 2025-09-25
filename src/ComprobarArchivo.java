import java.io.File;
import java.util.Scanner;

public class ComprobarArchivo {

    public static boolean checkFiles(File directory, File file) {
        try {
            if (!directory.isDirectory()) {
                throw new IllegalArgumentException("La ruta no es un directorio");
            }

            File[] directoryArray = directory.listFiles();
            if (directoryArray == null) {
                return false;
            }

            for (File f : directoryArray) {
                if (f.getAbsolutePath().equals(file.getAbsolutePath())) {
                    return true;
                }
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return false;
    }

}
