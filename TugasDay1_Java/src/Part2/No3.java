package Part2;
import java.util.Scanner;
public class No3 {
    public static void main(String[] args) {
        System.out.printf("%-30s %-30s\n", "Input", "Result");
        System.out.printf("%-30s %-30s\n",
                "\"this is a very special title\"",
                "\"" + Capitalize("this is a very special title") + "\"");

        System.out.printf("%-30s %-30s\n",
                "\"effective java is great\"",
                "\"" + Capitalize("effective java is great") + "\"");
    }

    public static String Capitalize(String input){
        if (input == null || input.trim().equals("")) {
            return "";
        }

        input = input.trim();
        StringBuilder result = new StringBuilder();

        String[] perKata = input.split(" ");
        for(String kata : perKata){
            if (kata.length() > 0) {
                result.append(Character.toUpperCase(kata.charAt(0)));
                result.append(kata.substring(1).toLowerCase());
            }
            result.append(" ");
        }

        return result.toString().trim();
    }
}