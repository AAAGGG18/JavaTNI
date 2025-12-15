import javax.swing.*;

public class Lab505 {
    public static boolean is_palindrome(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        String word = JOptionPane.showInputDialog("Enter some word:");

        if (is_palindrome(word)) {
            JOptionPane.showMessageDialog(null, word + " is Palindrome");
        } else {
            JOptionPane.showMessageDialog(null, word + " is NOT Palindrome");
        }
    }
}
