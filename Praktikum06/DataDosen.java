package Praktikum06;

import java.util.Arrays;

public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx = 0;

    void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx++] = dsn;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 1; i < idx; i++) {
            Dosen temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }

    int[] pencarianDataSequential(String nama) {
        int[] hasil = new int[idx];
        int count = 0;

        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                hasil[count++] = i;
            }
        }

        return Arrays.copyOf(hasil, count);
    }

    int pencarianDataBinary(int usia, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (dataDosen[mid].usia == usia) {
                return mid;
            } else if (dataDosen[mid].usia > usia) {
                return pencarianDataBinary(usia, left, mid - 1);
            } else {
                return pencarianDataBinary(usia, mid + 1, right);
            }
        }
        return -1;
    }
}
