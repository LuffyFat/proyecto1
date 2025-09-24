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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ruta del directorio: ");
        String route = scanner.nextLine();
        File directory = new File(route);

        System.out.print("Nombre del archivo a buscar: ");
        String fileName = scanner.nextLine();
        File search = new File(directory, fileName);

        boolean exists = checkFiles(directory, search);
        System.out.println("¿Existe el archivo en el directorio?: " + exists);
    }
}
