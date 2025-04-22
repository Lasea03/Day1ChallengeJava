package Day01Challenge;

import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input jumlah baris piramid : ");
        int n = scan.nextInt();

        iteration7(n);
    }

    public static void iteration7(int n) {
        for (int i = n; i >= 1; i--) {
            // Bagian kiri ke tengah (menurun)
            for (int j = i; j >= 1; j--) {
                System.out.printf("%4d", j);
            }

            // Bagian tengah ke kanan (menaik)
            for (int j = 2; j <= i; j++) {
                System.out.printf("%4d", j);
            }

            System.out.println();
        }
    }
}
