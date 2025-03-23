package Praktikum06;

public class Dosen {
    String kode;
    String nama;
    String jenisKelamin;
    int usia;

    Dosen(String kd, String name, String jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode         : " + kode);
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Usia         : " + usia);
        System.out.println("--------------------------");
    }
}
