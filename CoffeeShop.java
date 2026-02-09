package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {
    private static Scanner sc = new Scanner(System.in);
    private static int espressoCount = 0;
    private static int frappuccinoCount = 0;
    private static double totalPrice = 0;

    public static Espresso orderEspresso() {
        System.out.print("Enter a size: ");
        String size = sc.next();

        Espresso espresso = new Espresso(size);

        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        String ans = sc.next();

        if (ans.equalsIgnoreCase("y")) {
            System.out.print("How many shots for adding in Espresso: ");
            int shot = sc.nextInt();
            espresso.addShot(shot);
        }

        System.out.println(espresso);

        espressoCount++;
        totalPrice += espresso.calculateFinalPrice();

        return espresso;
    }

    public static Frappuccino orderFrappuccino() {
        System.out.print("Enter a size: ");
        String size = sc.next();

        System.out.print("Do you would like to add whipped cream [y/Y]?: ");
        String ans = sc.next();

        boolean whipped = ans.equalsIgnoreCase("y");

        Frappuccino frappuccino = new Frappuccino(size);
        if (whipped){
            frappuccino.addWhippedCream();
        }

        System.out.println(frappuccino);

        frappuccinoCount++;
        totalPrice += frappuccino.calculateFinalPrice();

        return frappuccino;
    }

    public static void main(String[] args) {

        String moreOrder;

        do {
            System.out.println("Press 1 for ordering Espresso");
            System.out.println("Press 2 for ordering Frappuccino");
            System.out.print("Enter an option: ");
            int option = sc.nextInt();

            if (option == 1) {
                orderEspresso();
            } else if (option == 2) {
                orderFrappuccino();
            } else {
                break;
            }

            System.out.print("\nDo you want to order more [y/Y]? ");
            moreOrder = sc.next();

        } while (moreOrder.equalsIgnoreCase("y"));

        System.out.println("\nYou ordered " + espressoCount + " Espresso");
        System.out.println("You ordered " + frappuccinoCount + " Frappuccino");
        System.out.println("Total Price = " + totalPrice);
    }
}
