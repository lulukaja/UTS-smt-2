/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSsemester2;

/**
 *
 * @author LULUK
 */
/*
Program No 5 : Mengurutkan Nama Mahasiswa (Versi Input Pengguna)
Metode: Bubble Sort, Selection Sort, Insertion Sort
*/
import java.util.Arrays;
import java.util.Scanner;
public class No5 {
    private static long[] dataBubbleomicron;
    public static void main(String[] args) {   
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("==================================================");
            System.out.println("      PENGURUTAN NAMA MAHASISWA (ALFABETIS)      ");
            System.out.println("==================================================");
            // Minta jumlah data yang mau dimasukkan
            System.out.print("Masukkan jumlah mahasiswa : ");
            int jumlah = input.nextInt();
            input.nextLine(); // Membersihkan sisa teks
            // Buat wadah array sesuai jumlah yang diminta
            String[] namaMahasiswa = new String[jumlah];
            // Masukkan nama satu per satu
            System.out.println("\n--- Masukkan Nama Mahasiswa ---");
            for (int i = 0; i < namaMahasiswa.length; i++) {
                System.out.print("Nama ke-" + (i+1) + " : ");
                namaMahasiswa[i] = input.nextLine();
            }
            // Simpan data asli agar sama untuk semua metode
            String[] dataAsli = Arrays.copyOf(namaMahasiswa, namaMahasiswa.length);
            // ===============  1. BUBBLE SORT  ===============
            System.out.println("\n\n>>> METODE 1 : BUBBLE SORT <<<");
            // Ambil data baru dari data asli
            String[] dataBubble = Arrays.copyOf(dataAsli, dataAsli.length);
            System.out.println("Data Awal : " + Arrays.toString(dataBubbleomicron));
            // Proses pengurutan
            for (int i = 0; i < dataBubble.length - 1; i++) {
                for (int j = 0; j < dataBubble.length - i - 1; j++) {
                    // Bandingkan abjad, tukar jika urutan salah
                    if (dataBubble[j].compareToIgnoreCase(dataBubble[j+1]) > 0) {
                        String simpan = dataBubble[j];
                        dataBubble[j] = dataBubble[j+1];
                        dataBubble[j+1] = simpan;
                    }
                }
                System.out.println("Langkah " + (i+1) + " : " + Arrays.toString(dataBubble));
            }
            System.out.println("Hasil Akhir : " + Arrays.toString(dataBubble));          
            // =============  2. SELECTION SORT  =============
            System.out.println("\n\n>>> METODE 2 : SELECTION SORT <<<");
            // Ambil data baru dari data asli
            String[] dataSelection = Arrays.copyOf(dataAsli, dataAsli.length);
            System.out.println("Data Awal : " + Arrays.toString(dataSelection));
            // Proses pengurutan
            for (int i = 0; i < dataSelection.length - 1; i++) {
                int posisiTerkecil = i; // Anggap data ke-i adalah terkecil
                // Cari data yang lebih kecil dari posisi saat ini
                for (int j = i + 1; j < dataSelection.length; j++) {
                    if (dataSelection[j].compareToIgnoreCase(dataSelection[posisiTerkecil]) < 0) {
                        posisiTerkecil = j;
                    }
                }
                // Tukar posisi data terkecil ke tempat yang seharusnya
                String simpan = dataSelection[posisiTerkecil];
                dataSelection[posisiTerkecil] = dataSelection[i];
                dataSelection[i] = simpan;
                System.out.println("Langkah " + (i+1) + " : " + Arrays.toString(dataSelection));
            }
            System.out.println("Hasil Akhir : " + Arrays.toString(dataSelection));
            // ============  3. INSERTION SORT  ==============
            System.out.println("\n\n>>> METODE 3 : INSERTION SORT <<<");
            // Ambil data baru dari data asli
            String[] dataInsertion = Arrays.copyOf(dataAsli, dataAsli.length);
            System.out.println("Data Awal : " + Arrays.toString(dataInsertion));
            // Proses pengurutan
            for (int i = 1; i < dataInsertion.length; i++) {
                String kunci = dataInsertion[i]; // Data yang mau disisipkan
                int j = i - 1;
                // Geser data yang lebih besar ke kanan
                while (j >= 0 && dataInsertion[j].compareToIgnoreCase(kunci) > 0) {
                    dataInsertion[j + 1] = dataInsertion[j];
                    j--;
                }
                // Taruh kunci di posisi yang tepat
                dataInsertion[j + 1] = kunci;
                System.out.println("Langkah " + i + " : " + Arrays.toString(dataInsertion));
            }
            System.out.println("Hasil Akhir : " + Arrays.toString(dataInsertion));
            // ============  PERBANDINGAN  ==============
            System.out.println("\n\n==================================================");
            System.out.println("         PERBANDINGAN KETIGA ALGORITMA           ");
            System.out.println("==================================================");
            System.out.println("1. BUBBLE SORT :");
            System.out.println("   + Sederhana, mudah dimengerti");
            System.out.println("   - Sering menukar data, agak lambat");
            System.out.println("   ~ Cara kerja: Bandingkan & tukar yang bersebelahan\n");
            System.out.println("2. SELECTION SORT :");
            System.out.println("   + Jumlah tukar data PALING SEDIKIT");
            System.out.println("   - Tetap cek semua data walau sudah urut");
            System.out.println("   ~ Cara kerja: Cari nilai terkecil, langsung taruh di tempatnya\n");
            System.out.println("3. INSERTION SORT :");
            System.out.println("   + Cepat jika data hampir urut, hemat memori");
            System.out.println("   - Kurang bagus untuk data sangat acak");
            System.out.println("   ~ Cara kerja: Ambil satu, sisipkan ke posisi pas\n");
            System.out.println("=> KESIMPULAN: SEMUA METODE MENGHASILKAN URUTAN SAMA!");
        }
    }
}