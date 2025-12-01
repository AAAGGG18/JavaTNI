import javax.swing.*;

public class EX301 {
    } public static void main (String[] args) {

        double total_price = Double.parseDouble(JOptionPane.showInputDialog("Enter total price:"));
        int coupon = JOptionPane.showConfirmDialog(null,
                "Do you have coupon?",
                "Coupon",
                JOptionPane.YES_NO_OPTION);

        if (coupon == JOptionPane.YES_OPTION){  //if (coupon == 0)
            int discount_coupon = Integer.parseInt(JOptionPane.showInputDialog("How many discount(%)?"));
            double discount = total_price * discount_coupon / 100;
            double net_price = total_price - discount;
            JOptionPane.showMessageDialog(null,
                    "You get discount " + discount + " baht.\n" +
                            "Total price is " + net_price + " baht.");
        } else {
            if (total_price >= 1500) {
                double discount = total_price * 10 / 100;
                double net_price = total_price - discount;
                JOptionPane.showMessageDialog(null,
                        "You get discount 10% (" + discount + ")\n" +
                                "Total price is " + net_price + " baht.");
            } else {
                JOptionPane.showMessageDialog(null, "Total price is " + total_price + " baht.");
            }
        }

    }
