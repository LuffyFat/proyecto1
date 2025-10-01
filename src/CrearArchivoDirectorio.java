import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CrearArchivoDirectorio {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        CrearArchivoDirectorio CAR = new CrearArchivoDirectorio();
        System.out.println("Que quieres crear");
        System.out.println("***********");
        System.out.println("[1]Directorio");
        System.out.println("[2]Archivo");
        System.out.println("***********");
        int a = sc.nextInt();
        CAR.CrearArchivoDirectorio(a);
    }

    public void CrearArchivoDirectorio(int sw) {
        Scanner sc = new Scanner(System.in);
        String scan = sc.nextLine();
        File f = new File(scan);
        try {
            if (sw == 1) {
                if (f.mkdir()) {
                    System.out.println("Directorio creado: " + f.getName());
                } else {
                    System.out.println("El directorio ya existe.");
                }
            } else if (sw == 2) {
                if (f.createNewFile()) {
                    System.out.println("Archivo creado: " + f.getName());
                } else {
                    System.out.println("El archivo ya existe.");
                }
            } else {
                System.out.println("No es ninguna");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

