import java.util.Scanner;

public class Lab604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {47, 13, 82, 17, 61, 29, 94, 36};

        display_array(numbers);

        int index = input_index(numbers, sc);

        System.out.println("\nThe number at index " + index + " is " + numbers[index]);

        if (check_index(numbers, index - 1)) {
            System.out.println("The number before index " + index + " is " + numbers[index - 1]);
        } else {
            System.out.println("The number before index " + index + " is Out of range!!");
        }

        if (check_index(numbers, index + 1)) {
            System.out.println("The number after index " +  index  + " is " + numbers[index + 1]);
        } else {
            System.out.println("The number after index " + index + " is Out of range!!");
        }
    }

    public static void display_array(int[] numbers) {
        System.out.print("Array: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static int input_index(int[] numbers, Scanner sc) {
        int index;

        System.out.print("Enter index: ");
        index = sc.nextInt();

        while (!check_index(numbers, index)) {
            System.out.print("Invalid index!! Enter index, again! : ");
            index = sc.nextInt();
        }

        return index;
    }

    public static boolean check_index(int[] numbers, int index) {
        return index >= 0 && index < numbers.length;
    }
}

