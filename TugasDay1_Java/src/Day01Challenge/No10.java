package Day01Challenge;
import java.util.Scanner;
public class No10 {
    public static void main(String[] args) {
        // Menampilkan tabel untuk n = 5
        System.out.println("Tabel dengan n = 5:");
        iteration10(5);
    }

    public static void iteration10(int n) {
        // Cetak header kolom
        System.out.print("    ");
        for (int j = 1; j <= n; j++) {
            System.out.printf("%2d ", j);
        }
        System.out.println();

        // Isi tabel
        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d ", i);


            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 == 0) {
                        System.out.printf("%2d ", j);
                    } else {
                        System.out.print(" - ");
                    }
                }
            }

            else {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 != 0) {
                        System.out.printf("%2d ", j);
                        System.out.print(" - ");
                    }
                }
            }
            System.out.println();
        }
    }
}
