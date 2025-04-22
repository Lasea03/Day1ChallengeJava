package Day01Challenge;
import java.util.Scanner;
public class No6 {
    public static void main(String[] args) {
        iteration6(5);
    }

    public static void iteration6(int n) {
        // Cetak header kolom
        System.out.print("    ");
        for (int j = 0; j < n; j++) {
            System.out.printf("%-4d", j);
        }
        System.out.println();

        // Cetak isi tabel
        for (int i = 0; i < n; i++) {
            System.out.printf("%-3d", i); // Label baris

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    // Diagonal utama (menurun dari 5 ke 1)
                    System.out.printf("%-4d", n - i);
                } else if (i < j) {
                    // Atas diagonal
                    System.out.printf("%-4d", 10);
                } else {
                    // Bawah diagonal
                    System.out.printf("%-4d", 20);
                }
            }
            System.out.println();
        }
    }
}
