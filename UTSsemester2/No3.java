/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSsemester2;

/**
 *
 * @author LULUK
 */
import java.util.Stack;
import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        // Membuat objek Stack untuk menyimpan daftar aksi pengguna
        Stack<String> riwayatAksi = new Stack<>();
        try (Scanner input = new Scanner(System.in)) {
            int pilihan;
            String aksi;
            
            System.out.println("==================================================");
            System.out.println("       SIMULASI FITUR UNDO - STRUKTUR STACK      ");
            System.out.println("==================================================");
            System.out.println("Daftar aksi yang tersedia:");
            System.out.println("1. Mengetik teks");
            System.out.println("2. Menghapus teks");
            System.out.println("3. Mengganti warna objek");
            System.out.println("4. Menambahkan gambar");
            System.out.println("5. Memindahkan posisi objek");
            System.out.println("6. Lakukan UNDO (Batalkan aksi terakhir)");
            System.out.println("7. Tampilkan semua riwayat aksi");
            System.out.println("8. Keluar dari program");
            System.out.println("==================================================");
            
            do {
                System.out.print("\nMasukkan pilihan Anda: ");
                pilihan = input.nextInt();
                input.nextLine(); // Membersihkan sisa input
                
                switch (pilihan) {
                    case 1 -> {
                        aksi = "Mengetik teks";
                        riwayatAksi.push(aksi); // Menyimpan aksi ke dalam Stack
                        System.out.println(" Aksi disimpan: " + aksi);
                    }
                    case 2 -> {
                        aksi = "Menghapus teks";
                        riwayatAksi.push(aksi);
                        System.out.println(" Aksi disimpan: " + aksi);
                    }
                    case 3 -> {
                        aksi = "Mengganti warna objek";
                        riwayatAksi.push(aksi);
                        System.out.println(" Aksi disimpan: " + aksi);
                    }
                    case 4 -> {
                        aksi = "Menambahkan gambar";
                        riwayatAksi.push(aksi);
                        System.out.println(" Aksi disimpan: " + aksi);
                    }
                    case 5 -> {
                        aksi = "Memindahkan posisi objek";
                        riwayatAksi.push(aksi);
                        System.out.println(" Aksi disimpan: " + aksi);
                    }
                    case 6 -> {
                        // Melakukan Undo = mengambil dan menghapus data paling atas (terakhir masuk)
                        if (!riwayatAksi.isEmpty()) {
                            String aksiDibatalkan = riwayatAksi.pop();
                            System.out.println(" UNDO dilakukan: Membatalkan aksi -> " + aksiDibatalkan);
                        } else {
                            System.out.println(" Tidak ada aksi yang bisa dibatalkan (Riwayat kosong).");
                        }
                    }
                    case 7 -> {
                        // Menampilkan isi tumpukan dari yang pertama sampai terakhir
                        System.out.println("\n Riwayat Aksi (Urutan dari awal sampai terakhir):");
                        if (riwayatAksi.isEmpty()) {
                            System.out.println("   - Kosong");
                        } else {
                            for (int i = 0; i < riwayatAksi.size(); i++) {
                                System.out.println("   " + (i + 1) + ". " + riwayatAksi.get(i));
                            }
                        }
                    }
                    case 8 -> System.out.println("Program selesai.");
                    default -> System.out.println("Pilihan tidak valid!");
                }
                
            } while (pilihan != 8);
        }
    }
}