package Day01Challenge;
import java.util.Scanner;
public class No2 {
    public static void main(String[] args) {
        iteration2(5); // Menentukan ukuran matriks (5x5)
    }

    public static void iteration2(int n) {

        System.out.print("    ");
        for (int j = 0; j < n; j++) {
            System.out.printf("%-4d", j);
        }
        System.out.println();

        // Cetak isi baris
        for (int i = 0; i < n; i++) {
            System.out.printf("%-3d", i);

            int counter = i + 1;
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.printf("%-4d", counter);
                    counter++;
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}
