/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSsemester2;

/**
 *
 * @author LULUK
 */
import java.util.Scanner;
public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tentukan jumlah produk dan hari
        System.out.print("Masukkan Jumlah Jenis Produk: ");
        int jumlahProduk = input.nextInt();
        final int JUMLAH_HARI = 7; // Harus 7 hari sesuai soal

        // Deklarasi Array
        int[][] dataPenjualan = new int[jumlahProduk][JUMLAH_HARI];
        String[] namaProduk = new String[jumlahProduk];
        int[] totalPerProduk = new int[jumlahProduk];

        // ==================================================
        // PROSES MENGINPUT DATA
        // ==================================================
        System.out.println("\n=== MULAI MENGINPUT DATA PENJUALAN ===");
        for (int i = 0; i < jumlahProduk; i++) {
            input.nextLine(); // Bersihkan sisa input
            System.out.print("Masukkan Nama Produk ke-" + (i + 1) + ": ");
            namaProduk[i] = input.nextLine();

            // Input data selama 7 hari
            for (int j = 0; j < JUMLAH_HARI; j++) {
                System.out.print("Jumlah terjual Hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = input.nextInt();
            }
            System.out.println("----------------------------------------");
        }

        // ==================================================
        // TAMPILKAN DATA DALAM BENTUK TABEL & HITUNG TOTAL
        // ==================================================
        System.out.println("\n============================= DATA PENJUALAN ==================================");
        System.out.print("Produk\t\t| H1 \t H2 \t H3 \t H4 \t H5 \t H6 \t H7 \t| Total");
        System.out.println("\n-------------------------------------------------------------------------------");

        for (int i = 0; i < jumlahProduk; i++) {
            System.out.print(namaProduk[i] + "\t|");
            for (int j = 0; j < JUMLAH_HARI; j++) {
                System.out.print(" " + dataPenjualan[i][j] + "\t");
                totalPerProduk[i] += dataPenjualan[i][j]; // Langsung dijumlahkan
            }
            System.out.print("|  " + totalPerProduk[i]);
            System.out.println();
        }
        System.out.println("===============================================================================");

        // ==================================================
        // CARI PENJUALAN TERTINGGI DAN KETERANGAN
        // ==================================================
        // Langkah 1: Cari nilai angka terbesar
        int nilaiTertinggi = 0;
        for (int i = 0; i < jumlahProduk; i++) {
            if (totalPerProduk[i] > nilaiTertinggi) {
                nilaiTertinggi = totalPerProduk[i];
            }
        }

        // Langkah 2: Hitung ada berapa produk yang punya angka terbesar tersebut
        int jumlahTertinggi = 0;
        for (int i = 0; i < jumlahProduk; i++) {
            if (totalPerProduk[i] == nilaiTertinggi) {
                jumlahTertinggi++;
            }
        }

        // ==================================================
        // TAMPILKAN HASIL AKHIR SESUAI KONDISI
        // ==================================================
        System.out.println("\nKESIMPULAN:");

        // Kondisi 1: Kalau SEMUA produk totalnya sama
        if (jumlahTertinggi == jumlahProduk) {
            System.out.println("Semua produk memiliki total penjualan yang sama, "
                    + "sehingga tidak ada produk yang menjadi penjualan tertinggi.");
            System.out.println("Total penjualan masing-masing produk: " + nilaiTertinggi + " barang");
        } 
        // Kondisi 2: Kalau ada yang sama tapi tidak semuanya / atau cuma satu yang tertinggi
        else {
            System.out.println("Jumlah penjualan tertinggi: " + nilaiTertinggi + " barang");
            System.out.print("Produk dengan penjualan tertinggi: ");
            for (int i = 0; i < jumlahProduk; i++) {
                if (totalPerProduk[i] == nilaiTertinggi) {
                    System.out.print(namaProduk[i] + ", ");
                }
            }
        }
        System.out.println("\n==========================================================================");
    }
}