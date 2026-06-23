package bagian1.berkas;

import java.io.File;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        File laporan = new File("laporan.txt");

        System.out.println("Apakah laporan.txt ada? " + laporan.exists());

        if (laporan.exists()) {
            System.out.println("Ukuran: " + laporan.length() + " byte");
        }
    }
}