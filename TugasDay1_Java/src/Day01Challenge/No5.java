package Day01Challenge;
import java.util.Scanner;
public class No5 {
    public static void main(String[] args) {
        iteration5(5);
    }

    public static void iteration5(int n) {
        // Cetak header kolom
        System.out.print("    ");
        for (int j = 0; j < n; j++) {
            System.out.printf("%-4d", j);
        }
        System.out.println();

        // Isi tabel
        for (int i = 0; i < n; i++) {
            // Label baris
            System.out.printf("%-3d", i);

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    // Diagonal utama
                    System.out.printf("%-4d", j + 1);
                } else if (i < j) {
                    // Di atas diagonal
                    System.out.printf("%-4d", 10);
                } else {
                    // Di bawah diagonal
                    System.out.printf("%-4d", 20);
                }
            }
            System.out.println();
        }
    }
}
