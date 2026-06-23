// Nama: Rahimah
// NPM: 2410010062
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        String[] kategori = {"Elektronik", "Sembako", "Alat Tulis"};
        System.out.println("== Kategori Barang ==");
        for (String k : kategori) {
            System.out.println("- " + k);
        }
        System.out.println();

        Gudang gudang = new Gudang("barang.txt");
        gudang.tambahBarang(new Barang("Kabel HDMI", 45000, 20));
        gudang.tambahBarang(new Barang("Beras 5kg", 65000, 50));
        gudang.tambahBarang(new Barang("Pulpen", 3000, 200));
        gudang.tambahBarang(new Barang("Mouse Wireless", 85000, 15));
        gudang.tambahBarang(new Barang("Buku Tulis", 5000, 100));

        gudang.tampilkanSemua();
        gudang.simpanKeBerkas();
        System.out.println();

        Gudang gudangLain = new Gudang("barang.txt");
        gudangLain.muatDariBerkas();
        gudangLain.tampilkanSemua();
        System.out.println("Total nilai persediaan: " + gudangLain.totalNilai());
    }
}