import java.util.Scanner;

public class Lab503 {

    public static int count_vowel(String message, char letter) {
        int count = 0;
        message = message.toUpperCase();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = sc.nextLine();
        System.out.println();
        System.out.println("List of vowel in \"" + message + "\"");
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        for (char v : vowels) {
            int result = count_vowel(message, v);
            System.out.println("The letter '" + v + "' appears " + result + " time(s).");
        }
        sc.close();
    }
}
