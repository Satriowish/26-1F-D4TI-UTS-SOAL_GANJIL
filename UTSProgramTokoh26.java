import java.util.Scanner;

// Nama : Satrio Wisnu Adi Pratama
// NIM  : 2341720219
// Soal Ganjil 

public class UTSProgramTokoh26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        double TotalHarga = 0;
        double HargaBarang = 0;
        double PPN = 0;
        int JumlahMinumanygDibeli = 0;
        String JenisBarang, NamaBarang, Lanjut, BeliKantong;

        while (true) {
            System.out.print("Masukkan Jenis barang (minuman/makanan)            : ");
            JenisBarang = input26.next();
            System.out.print("Masukkan Nama barang                               : ");
            NamaBarang = input26.next();
            System.out.print("Masukkan Harga barang                              : ");
            HargaBarang = input26.nextDouble();

            if (JenisBarang.equals("minuman")) {
                JumlahMinumanygDibeli++;
                if (JumlahMinumanygDibeli == 3) {
                    HargaBarang *= 0.95; // Akan Mendapat Diskon 5% untuk setiap pembelian 3 buah Minuman
                }
            }
            TotalHarga += HargaBarang;

            System.out.println();//
            System.out.print("Apakah anda ingin membeli barang lain ? (ya/tidak) : ");
            Lanjut = input26.next();
            if (Lanjut.equalsIgnoreCase("tidak")) {
                break;
            }
        }
        System.out.println();//
        System.out.print("Tambahkan kantong plastik ? (ya/tidak)             : ");
        BeliKantong = input26.next();
        if (BeliKantong.equalsIgnoreCase("ya")) {
            TotalHarga += 200;
        }
        if (TotalHarga >= 1000000) {
            PPN = TotalHarga * 0.07; // Jika Total pembelian lebih besar sama dengan 1 juta, maka akan dikenai PPN
                                     // 7%.
            TotalHarga += PPN;
        }
        System.out.println();//
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Total biaya belanja yang harus dibayarkan          : Rp. " + TotalHarga);

    }
}
