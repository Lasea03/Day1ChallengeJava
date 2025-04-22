package Day01Challenge;
import java.util.Scanner;
public class No9 {
    public static void main(String[] args) {

        // Menampilkan tabel dengan n = 9
        System.out.println("\n n = 9:");
        iteration9(9);
    }

    public static void iteration9(int n) {
        // Cetak header kolom
        System.out.print("   ");
        for (int j = 0; j < n; j++) {
            System.out.printf("%2d ", j);
        }
        System.out.println();

        // Cetak isi tabel
        for (int i = 0; i < n; i++) {
            System.out.printf("%2d ", i); // Label baris
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.printf("%2d ", n - j);
                } else {
                    System.out.printf("%2d ", j + 1);
                }
            }
            System.out.println();
        }
    }
}
