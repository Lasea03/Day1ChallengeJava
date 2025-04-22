package Part2;
import java.util.Scanner;
public class No2 {public static void main(String[] args) {
    System.out.printf("%-12s %s%n", "Input", "Result");

    System.out.printf("%-12d %b%n", 121,         isPalindrome(121));
    System.out.printf("%-12d %b%n", 2147447412,  isPalindrome(2147447412));
    System.out.printf("%-12d %b%n", 110,         isPalindrome(110));
}

    public static int Reverse(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int n) {
        return Reverse(n) == n;
    }
}
