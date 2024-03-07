import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    private String Nama;
    private String NIM;
    private String Jurusan;

    // List untuk menyimpan banyak mahasiswa
    private static List<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public Mahasiswa(String Nama, String NIM, String Jurusan) {
        this.Nama = Nama;
        this.NIM = NIM;
        this.Jurusan = Jurusan;

        // Menambahkan objek Mahasiswa ke dalam daftarMahasiswa
        daftarMahasiswa.add(this);
    }

    public static void tampilkanUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");
    }

    // Tampilkan data semua mahasiswa
    public static void tampilkanData() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            for (Mahasiswa mahasiswa : daftarMahasiswa) {
                System.out.println("Nama: " + mahasiswa.Nama + " NIM: " + mahasiswa.NIM + " Jurusan: " + mahasiswa.Jurusan);
            }
        }
    }
}
