import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class GestorArchivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File filePath = new File(sc.nextLine());
        try {
            filePath.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Tamaño: " + filePath.length());
        System.out.println("Ultima modificación: " + filePath.lastModified());

        try {
            if (Files.exists(Paths.get("notas.txt"))) {
                String notas = Files.readString(Paths.get("notas.txt"));
                System.out.println(notas);
                Files.writeString(Paths.get("salida.txt"), notas);
            } else {
                System.out.println("El archivo notas.txt no existe.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
