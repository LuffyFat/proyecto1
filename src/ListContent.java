import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ListContent {
    
    public static void mostraRuta(File f) throws FileNotFoundException{
        if (!f.exists())
            throw new FileNotFoundException("ERROR - Ruta no valida");

        if (f.isFile())
            System.out.println("El nom del archiu es: " + f.getName());

        else if (f.isDirectory()){
            File[] llista = f.listFiles();

            for (int i = 0; i < llista.length; i++) {
                if(llista[i].isFile())
                    System.out.println("[A]" + llista[i].getName());
                else if (llista[i].isDirectory())
                    System.out.println("[D]" + llista[i].getName());

            }
        };

    }
}
