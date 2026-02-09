package CoffeeShop;

public class Espresso extends Drink {
    private int shot;

    public Espresso(String size) {
        super("Espresso", 35, size);
        this.shot = 0;
    }

    public void addShot(int shot) {
        this.shot += shot;
    }

    public int getShot() {
        return shot;
    }

    @Override
    public double calculateFinalPrice() {
        double price = 0;

        if (size.equalsIgnoreCase("S")) {
            price = 30;
        } else if (size.equalsIgnoreCase("M")) {
            price = 35;
        } else if (size.equalsIgnoreCase("L")) {
            price = 40;
        }

        price += shot * 15;
        return price;
    }

    @Override
    public String toString() {
        String result = super.toString();

        if (shot > 0) {
            result += "\nAdded " + shot + " shot";
        }

        result += "\nTotal price = " + calculateFinalPrice() + " Baht";
        return result;
    }
}
