import java.util.Scanner;

public class CakeOrder {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //cake
        System.out.println("Birthday Cake's Details: ");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor : ");
        String flavor = scanner.next();
        System.out.print("How many pounds: ");
        double pound = scanner.nextDouble();

        BirthdayCake order1 = new BirthdayCake(message, pound, flavor, 350);
        System.out.println(order1);

        // Cup Cake
        System.out.println("\nCup Cake's Details: ");
        System.out.print("Enter a flavor : ");
        String cupFlavor = scanner.next();
        System.out.print("How many pieces: ");
        int piece = scanner.nextInt();

        CupCake order2 = new CupCake(piece, cupFlavor, 65);
        System.out.println(order2);

        // HorseSnacks
        System.out.println("\nHorseSnacks Details: ");
        System.out.print("Enter a flavor : ");
        String horseFlavor = scanner.next();
        System.out.print("How many lumps: ");
        int lump = scanner.nextInt();

        HorseSnacks order3 = new HorseSnacks(lump, horseFlavor, 100);
        System.out.println(order3);

        // Total
        System.out.println("\nTotal price = " +
                (order1.calculateTotalPrice()
                        + order2.calculateTotalPrice()
                        + order3.calculateTotalPrice()));
    }
}
