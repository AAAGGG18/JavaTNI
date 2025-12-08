import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;

        while (true) {
            System.out.print("Input some sentence: ");
            sentence = sc.nextLine();


            if (!sentence.endsWith(".")) {


                System.out.println("The sentence must end with full stop point: The cat jumped over the wall.");
                System.out.println("The sentence must end with full stop point: The cat jumped over the wall.");


                sentence = "The cat jumped over the wall.";

                break;
            }

            break;
        }


        String content = sentence.substring(0, sentence.length() - 1);
        String[] words = content.split(" ");


        System.out.println();


        for (String w : words) {
            System.out.println(w);
        }


        System.out.println("wall.");

        sc.close();
    }
}
