import javax.swing.*;

public class Lab302 {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Input your name:");
        String heightStr = JOptionPane.showInputDialog("Input your height(cm):");
        double height = Double.parseDouble(heightStr);
        double stdWeight = 0;


        int isMale = JOptionPane.showConfirmDialog(null,
                "Are you Male?",
                "Gender Confirmation",
                JOptionPane.YES_NO_OPTION);

        if (isMale == JOptionPane.YES_OPTION) {
            stdWeight = height - 100;
            JOptionPane.showMessageDialog(null,
                    "Mr." + name + ", your standard weight is " + stdWeight + " kg.");
        } else {

            int isFemale = JOptionPane.showConfirmDialog(null,
                    "Are you Female?",
                    "Gender Confirmation",
                    JOptionPane.YES_NO_OPTION);

            if (isFemale == JOptionPane.YES_OPTION) {
                stdWeight = height - 110;
                JOptionPane.showMessageDialog(null,
                        "Ms." + name + ", your standard weight is " + stdWeight + " kg.");
            } else {

                JOptionPane.showMessageDialog(null,
                        "You can use BMI to measure your weight and height.");
            }
        }
    }
}
