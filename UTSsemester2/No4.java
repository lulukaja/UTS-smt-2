/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSsemester2;

/**
 *
 * @author LULUK
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Queue<String> antrean = new LinkedList<>();
        try (Scanner input = new Scanner(System.in)) {
            int pilihan = 0;
            
            do {
                System.out.println("\n===== Sistem Antrean Pesanan Restoran =====");
                System.out.println("1. Tambah Pesanan Pelanggan");
                System.out.println("2. Tampilkan Daftar Antrean");
                System.out.println("3. Proses Pesanan Pertama");
                System.out.println("4. Tampilkan Antrean Setelah Diproses");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu (1-5): ");
                
                // Cek apakah masukan berupa angka, mencegah error jika ketik huruf
                if (input.hasNextInt()) {
                    pilihan = input.nextInt();
                    input.nextLine(); // Membersihkan sisa karakter di input
                } else {
                    System.out.println("Masukan salah! Harap masukkan angka 1 sampai 5 saja.");
                    input.nextLine(); // Membuang masukan yang salah
                    continue; // Kembali ke menu utama
                }
                
                switch (pilihan) {
                    case 1 -> {
                        // Menambahkan pesanan ke dalam antrean
                        System.out.print("Masukkan nama pesanan: ");
                        String pesanan = input.nextLine();
                        antrean.add(pesanan);
                        System.out.println("Pesanan berhasil ditambahkan!");
                    }
                        
                    case 2 -> {
                        // Menampilkan seluruh daftar antrean
                        System.out.println("\nDaftar Antrean Saat Ini:");
                        if (antrean.isEmpty()) {
                            System.out.println("Antrean kosong.");
                        } else {
                            int urutan = 1;
                            for (String data : antrean) {
                                System.out.println(urutan + ". " + data);
                                urutan++;
                            }
                        }
                    }
                        
                    case 3 -> {
                        // Memproses pesanan yang berada di urutan paling depan
                        if (antrean.isEmpty()) {
                            System.out.println("Tidak ada pesanan untuk diproses.");
                        } else {
                            String pesananDiproses = antrean.poll();
                            System.out.println("Sedang memproses pesanan: " + pesananDiproses);
                        }
                    }
                        
                    case 4 -> {
                        // Menampilkan sisa antrean setelah ada pesanan diproses
                        System.out.println("\nAntrean Pesanan Setelah Diproses:");
                        if (antrean.isEmpty()) {
                            System.out.println("Antrean kosong.");
                        } else {
                            int urutan = 1;
                            for (String data : antrean) {
                                System.out.println(urutan + ". " + data);
                                urutan++;
                            }
                        }
                    }
                        
                    case 5 -> System.out.println("Program selesai. Terima kasih!");
                        
                    default -> // Jika angka yang dimasukkan di luar rentang 1-5
                        System.out.println("Pilihan tidak tersedia! Silakan pilih angka 1 sampai 5.");
                }
            } while (pilihan != 5);
        }
    }
}