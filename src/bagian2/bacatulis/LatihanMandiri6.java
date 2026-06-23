package bagian2.bacatulis;

import java.io.*;

public class LatihanMandiri6 {
    public static void main(String[] args) {

        int jumlahBaris = 0;

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {

            while (pembaca.readLine() != null) {
                jumlahBaris++;
            }

            System.out.println("Jumlah baris dalam hari.txt = " + jumlahBaris);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}