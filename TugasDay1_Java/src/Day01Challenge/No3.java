package Day01Challenge;
import java.util.Scanner;
public class No3 {
    public static void main(String[] args) {
        iteration3(5);
    }

    public static void iteration3(int n) {
        // Cetak header kolom
        System.out.print("    ");
        for (int j = 0; j < n; j++) {
            System.out.printf("%-4d", j);
        }
        System.out.println();

        // Cetak isi tabel
        for (int i = 0; i < n; i++) {
            System.out.printf("%-3d", i);
            for (int j = 0; j < n; j++) {
                if (j <= n - i - 1) {
                    System.out.printf("%-4d", i + j + 1);
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}
