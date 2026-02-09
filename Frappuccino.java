package CoffeeShop;

public class Frappuccino extends Drink {
    private boolean whippedCream;

    public Frappuccino(String size) {
        super("Frappuccino", 40, size);
        this.whippedCream = false;
    }

    public void addWhippedCream() {
        whippedCream = true;
    }

    public boolean hasWhippedCream() {
        return whippedCream;
    }

    @Override
    public double calculateFinalPrice() {
        double price = basePrice;

        if (whippedCream) {
            price += 15;
        }

        return price;
    }

    @Override
    public String toString() {
        String result = super.toString();

        if (whippedCream) {
            result += "\nAdded whipped cream";
        }

        result += "\nTotal price = " + calculateFinalPrice() + " Baht";
        return result;
    }
}
