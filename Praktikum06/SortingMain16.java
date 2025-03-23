package Praktikum06;
public class SortingMain16 {
    
        public static void main(String[] args) {
            int a[] = {20, 10, 2, 7, 12};
            int b[] = {30, 20, 2, 8, 14};
            int c[] = {40, 10, 4, 9, 3};
    
           
            Sorting16 dataurut3 = new Sorting16(c, c.length);
    
            System.out.println("Data awal 3:");
            dataurut3.tampil();
            dataurut3.SelectionSort();
            System.out.println("Data setelah diurutkan dengan INSERTION SORT (ASC)");
            dataurut3.tampil();
        }
    
}
