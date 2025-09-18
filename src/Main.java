import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        String ruta = "";
        Scanner scanner = new Scanner(System.in);

        do{
            try{
                System.out.println("\n---------------------");
                System.out.println("Introduce una ruta");
                System.out.println("\n---------------------");
                System.out.println("Ruta: ");

                ruta = scanner.nextLine();

                if(!ruta.equals("")){
                    File fitxer = new File(ruta);
                    mostraRuta(fitxer);
                }

            }catch (FileNotFoundException e){
                System.err.println(e);
            }
        }while (!ruta.equals(""));
        System.out.println("Fi del programa");
    }
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
