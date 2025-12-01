import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {


        Scanner kb = new Scanner(System.in);

        System.out.print("How many number to input: ");
        int n = kb.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = kb.nextInt();


            if (num > max) max = num;
            if (num < min) min = num;


            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("\nMaximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Even number = " + evenCount);
        System.out.println("Odd number = " + oddCount);

        kb.close();
    }
}
