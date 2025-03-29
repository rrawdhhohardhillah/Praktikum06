package Praktikum06;

import java.util.Scanner;
import java.util.Arrays;

public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen listDosen = new DataDosen();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Usia Tertua ke Termuda)");
            System.out.println("5. Cari Dosen berdasarkan Nama (Sequential)");
            System.out.println("6. Cari Dosen berdasarkan Usia (Binary)");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Jenis Kelamin: ");
                    String jenisKelamin = sc.nextLine();
                    System.out.print("Masukkan Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen dsn = new Dosen(kode, nama, jenisKelamin, usia);
                    listDosen.tambah(dsn);
                    break;

                case 2:
                    System.out.println("\nData Dosen:");
                    listDosen.tampil();
                    break;

                case 3:
                    listDosen.sortingASC();
                    System.out.println("\nData setelah sorting ASC:");
                    listDosen.tampil();
                    break;

                case 4:
                    listDosen.sortingDSC();
                    System.out.println("\nData setelah sorting DSC:");
                    listDosen.tampil();
                    break;

                case 5:
                    System.out.print("Masukkan nama yang ingin dicari: ");
                    String cariNama = sc.nextLine();
                    int[] hasilNama = listDosen.pencarianDataSequential(cariNama);

                    if (hasilNama.length > 0) {
                        System.out.println("Dosen dengan nama " + cariNama + " ditemukan pada indeks " + Arrays.toString(hasilNama));
                        if (hasilNama.length > 1) {
                            System.out.println("Peringatan: Terdapat lebih dari satu hasil pencarian.");
                        }
                    } else {
                        System.out.println("Dosen dengan nama " + cariNama + " tidak ditemukan.");
                    }
                    break;

                case 6:
                    listDosen.sortingASC();
                    System.out.print("Masukkan usia yang ingin dicari: ");
                    int cariUsia = sc.nextInt();
                    int hasilUsia = listDosen.pencarianDataBinary(cariUsia, 0, listDosen.idx - 1);

                    if (hasilUsia != -1) {
                        System.out.println("Dosen dengan usia " + cariUsia + " ditemukan pada indeks " + hasilUsia);
                    } else {
                        System.out.println("Dosen dengan usia " + cariUsia + " tidak ditemukan.");
                    }
                    break;

                case 7:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 7);

        sc.close();
    }
}
