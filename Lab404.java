import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result = "";
        String word;

        while (true) {
            System.out.print("Enter word: ");
            word = sc.next();

            if (word.equalsIgnoreCase("stop")) {
                System.out.println(result.trim());
                break;
            }

            result += word + " ";
        }

        sc.close();
    }
}
