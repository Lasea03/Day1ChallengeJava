package Part2;
import java.util.Scanner;
public class No5 {
    public static void main(String[] args) {
        System.out.printf("%-15s %-10s\n", "Input", "Result");
        System.out.printf("%-15s %-10b\n", "\"()\"", isBrace("()"));
        System.out.printf("%-15s %-10b\n", "\"(()())\"", isBrace("(()())"));
        System.out.printf("%-15s %-10b\n", "\"((())\"", isBrace("((())"));
        System.out.printf("%-15s %-10b\n", "\")(\"", isBrace(")("));
    }

    public static boolean isBrace(String s) {
        int udahKetutup = 0;

        for (int i = 0; i < s.length(); i++) {
            char brace = s.charAt(i);

            if (brace == '(') {
                udahKetutup++;
            } else if (brace == ')') {
                udahKetutup--;
                if (udahKetutup < 0) {
                    return false;
                }
            }
        }

        return udahKetutup == 0;
    }
}



