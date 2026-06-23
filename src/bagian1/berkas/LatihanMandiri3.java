package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri3 {
    public static void main(String[] args) {
        File sementara = new File("sementara.txt");

        try {
            sementara.createNewFile();

            System.out.println("Sebelum dihapus: " + sementara.exists());

            sementara.delete();

            System.out.println("Sesudah dihapus: " + sementara.exists());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}