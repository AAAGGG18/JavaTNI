public class HorseSnacks extends Bakery {

    private int lump;

    public HorseSnacks(int lump, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.lump = lump;
    }


    public boolean isPackingBox() {
        return lump >= 3;
    }

    public int getBoxNumber() {
        if (isPackingBox()) {
            return lump / 3;
        }
        return 0;
    }

    public int getBagNumber() {
        return lump % 3;
    }

    @Override
    public double calculateTotalPrice() {
        double snackPrice = lump * getUnitPrice();
        int boxCost = getBoxNumber() * getPackingCost();
        double bagCost = getBagNumber() * 0.5;

        return snackPrice + boxCost + bagCost;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nHorseSnacks (" + getFlavor() + "), lump = " + lump
                + "\nPacking: "
                + (isPackingBox() ? getBoxNumber() + " Box " : "")
                + getBagNumber() + " Bag"
                + "\nTotal price of HorseSnacks = " + calculateTotalPrice();
    }
}