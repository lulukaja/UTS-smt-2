/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSsemester2;
/**
 *
 * @author LULUK
 */
import java.util.Arrays;
import java.util.Scanner;
public class No6 {
    public static void main(String[] args) {        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("==================================================");
            System.out.println("   PENGURUTAN HARGA PRODUK (TERMURAH KE TERMAHAL)  ");
            System.out.println("==================================================");            
            // Minta jumlah data, minimal harus 10
            int jumlah;
            do {
                System.out.print("Masukkan jumlah produk (minimal 10) : ");
                jumlah = input.nextInt();
                if (jumlah < 10) {
                    System.out.println("! Jumlah data kurang dari 10, silakan ulangi !\n");
                }
            } while (jumlah < 10); // Ulangi kalau kurang dari 10            
            // Buat wadah array untuk harga
            int[] harga = new int[jumlah];            
            // Masukkan data harga satu per satu
            System.out.println("\n--- Masukkan Harga Produk ---");
            for (int i = 0; i < harga.length; i++) {
                System.out.print("Harga ke-" + (i+1) + " : Rp. ");
                harga[i] = input.nextInt();
            }            
            // Simpan data asli untuk ditampilkan sebelum diurutkan
            int[] dataAwal = Arrays.copyOf(harga, harga.length);
            // ===============  PROSES INSERTION SORT  ===============
            System.out.println("\n\n>>> PROSES PENGURUTAN <<<");
            System.out.println("Data Sebelum Diurutkan : " + Arrays.toString(dataAwal));
            // Logika Utama Insertion Sort
            for (int i = 1; i < harga.length; i++) {                
                // Ambil satu nilai yang akan diurutkan (disebut kunci)
                int kunci = harga[i];
                int j = i - 1;                
                // Geser nilai yang lebih besar dari kunci ke arah kanan
                while (j >= 0 && harga[j] > kunci) {
                    harga[j + 1] = harga[j];
                    j = j - 1;
                }                
                // Taruh nilai kunci di posisi yang sudah dikosongkan
                harga[j + 1] = kunci;                
                // Tampilkan proses per langkah
                System.out.println("Langkah ke-" + i + "          : " + Arrays.toString(harga));
            }            
            // Tampilkan hasil akhir
            System.out.println("---------------------------");
            System.out.println("Data Sesudah Diurutkan  : " + Arrays.toString(harga));
            // ===============  PENJELASAN CARA KERJA  ===============
            System.out.println("\n\n==================================================");
            System.out.println("        PENJELASAN LANGKAH KERJA ALGORITMA       ");
            System.out.println("==================================================");
            System.out.println("Algoritma yang dipakai : INSERTION SORT");
            System.out.println("Cara kerjanya sederhana seperti menyusun kartu di tangan:\n");
            System.out.println("1. Ambil data kedua sebagai 'Nilai Kunci' yang akan disusun.");
            System.out.println("2. Bandingkan 'Nilai Kunci' tersebut dengan data-data di sebelah kirinya (yang sudah dianggap urut).");
            System.out.println("3. Jika data di kiri lebih besar dari 'Kunci', geser data tersebut ke kanan satu langkah.");
            System.out.println("4. Lakukan terus sampai ketemu posisi di mana data kirinya lebih kecil.");
            System.out.println("5. Masukkan 'Nilai Kunci' ke tempat yang sudah dikosongkan tadi.");
            System.out.println("6. Ulangi langkah 1 sampai 5 untuk semua data berikutnya sampai selesai.");
            System.out.println("\n=> Hasil akhirnya data akan tersusun rapi dari nilai terkecil ke terbesar.");
        }
    }
}