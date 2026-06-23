package bagian2.bacatulis;

import java.io.*;

public class LatihanMandiri4 {
    public static void main(String[] args) {

        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {
            penulis.println("Senin");
            penulis.println("Selasa");
            penulis.println("Rabu");
            penulis.println("Kamis");
            penulis.println("Jumat");

            System.out.println("Data hari berhasil ditulis.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nIsi hari.txt:");

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;

            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}