package Day01Challenge;
import java.util.Scanner;
public class No4 {
    public static void main(String[] args) {
        iteration4(5);
    }

    public static void iteration4(int n) {
        // Cetak header kolom
        System.out.print("    ");
        for (int j = 0; j < n; j++) {
            System.out.printf("%-4d", j);
        }
        System.out.println();

        // Isi tabel
        for (int i = 0; i < n; i++) {
            System.out.printf("%-3d", i);

            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    System.out.printf("%-4d", j + 1);
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}
