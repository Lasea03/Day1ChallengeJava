package Part2;
import java.util.Scanner;
public class No1 {
    public static void main(String[] args) {
        // Cetak header kolom
        System.out.printf("%-10s %s%n", "Reverse", "Result");
        // Cetak data
        System.out.printf("%-10d %d%n", 42,   Reverse(42));
        System.out.printf("%-10d %d%n", 413,  Reverse(413));
        System.out.printf("%-10d %d%n", 4563, Reverse(4563));
    }

    public static int Reverse(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }
}
