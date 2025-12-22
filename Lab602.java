import java.util.Scanner;

public class Lab602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] movies = {
                "Me Before You",
                "Titanic",
                "Before Sunrise",
                "The Holiday",
                "A Walk to Remember"
        };

        double[] rate_scores = {4.2, 4.9, 4.4, 3.7, 4.3};

        System.out.print("Enter movie title: ");
        String title = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < movies.length; i++) {
            if (title.equalsIgnoreCase(movies[i])) {
                System.out.println();
                System.out.println("\nThe rating score of \"" + movies[i] + "\" is " + rate_scores[i]);

                // แสดง rank เฉพาะกรณี Titanic
                if (movies[i].equalsIgnoreCase("Titanic")) {
                    System.out.println("This movie is ranked number 1");
                }

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nCannot found this movie title...");
        }
    }
}