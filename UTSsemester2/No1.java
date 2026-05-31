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
public class No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // AWALNYA SEMUA KURSI OTOMATIS KOSONG (NILAI 0)
        int[][] kursi = new int[5][5]; 
        int kosong = 0, terisi = 0;
        int pilihNomor; // Tempat simpan angka yang kita ketik

// ==========================================================
// 1. MENAMPILKAN PATOKAN & PENJELASAN
// ==========================================================
        System.out.println("==================================================");
        System.out.println("            DAFTAR KURSI & NOMOR PATOKAN         ");
        System.out.println("==================================================");
        System.out.println("Lihat nomor di bawah, lalu ketik angkanya!");
        System.out.println("Jika sudah selesai mengisi, ketik angka: 0");
        System.out.println();

        // Tampilkan patokan nomor 1 - 25
        int nomorPatokan = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print("| ");
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ", nomorPatokan);
                nomorPatokan++;
            }
            System.out.println("|");
        }

// =========================
// 2. PROSES MENGISI KURSI 
// =========================
        System.out.println("\n==================================================");
        System.out.println("                 MULAI MENGISI KURSI            ");
        System.out.println("==================================================");

        do {
            System.out.print("\nMasukkan Nomor Kursi Yang Akan Terisi(1-25) atau 0 jika selesai: ");
            pilihNomor = input.nextInt();

            // JIKA KETIK 0 : BERHENTI
            if (pilihNomor == 0) {
                System.out.println("Pengisian selesai. Terima kasih!");
                break;
            }

            // JIKA KETIK ANGKA SALAH
            if (pilihNomor < 1 || pilihNomor > 25) {
                System.out.println("Angka tidak valid! Harap masukkan angka 1 sampai 25 saja.");
            } 
            else {
                // Ubah nomor jadi posisi baris & kolom
                int baris = (pilihNomor - 1) / 5;
                int kolom = (pilihNomor - 1) % 5;

                // JIKA KETIK NOMOR YANG SUDAH ADA
                if (kursi[baris][kolom] == 1) {
                    System.out.println("Perhatian: Nomor " + pilihNomor + " ini sudah terisi sebelumnya!");
                } 
                // JIKA BENAR, BARU DIISI
                else {
                    kursi[baris][kolom] = 1;
                    System.out.println("Berhasil: Kursi nomor " + pilihNomor + " telah diisi.");
                }
            }

        } while (pilihNomor != 0);

// ==================================================
// 3. MENAMPILKAN DATA AWAL (DIPINDAH KE BAWAH)
// ==================================================
        System.out.println("\n\n==================================================");
        System.out.println("           DATA AWAL: SEMUA KURSI KOSONG        ");
        System.out.println("==================================================");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("0  ");
            }
            System.out.println();
        }

// ==================================================
// 4. MENAMPILKAN DATA SETELAH DIUBAH
// ==================================================
        System.out.println("\n==================================================");
        System.out.println("          DATA KURSI SETELAH DIUBAH ISI         ");
        System.out.println("==================================================");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(kursi[i][j] + "  ");
                // Menghitung jumlah kursi kosong dan terisi
                if (kursi[i][j] == 0) {
                    kosong++;
                } else {
                    terisi++;
                }
            }
            System.out.println();
        }

// =======================
// 5. HASIL PERHITUNGAN
// =======================
        System.out.println("\n==================================================");
        System.out.println("Jumlah kursi kosong : " + kosong);
        System.out.println("Jumlah kursi terisi : " + terisi);
        System.out.println("==================================================");
    }
}