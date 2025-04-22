package Day01Challenge;
import java.util.Scanner;
public class No1 {
    public static void main(String[] args) {
        int b = 5;
        int k = 5;
        int a = 1;

        // Cetak header kolom
        System.out.print("   ");
        for (int j = 0; j < k; j++) {
            System.out.printf("%-4d", j);
        }
        System.out.println();

        // Cetak isi matriks dengan indeks baris
        for (int i = 0; i < b; i++) {
            System.out.printf("%-3d", i);
            for (int j = 0; j < k; j++) {
                System.out.printf("%-4d", a);
                a++;
            }
            System.out.println();
        }
    }
}

