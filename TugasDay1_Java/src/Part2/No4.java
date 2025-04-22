package Part2;
import java.util.Scanner;
public class No4 {

        public static void main(String[] args) {
            System.out.printf("%-15s %-10s\n", "Input", "Result");
            System.out.printf("%-15s %-10b\n", "\"codeid\"", IsNoDuplicateChar("codeid"));
            System.out.printf("%-15s %-10b\n", "\"abcde\"", IsNoDuplicateChar("abcde"));
            System.out.printf("%-15s %-10b\n", "\"jdbc\"", IsNoDuplicateChar("jdbc"));
        }

        public static boolean IsNoDuplicateChar(String s){
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        return false;
                    }
                }
            }
            return true;
        }


}


