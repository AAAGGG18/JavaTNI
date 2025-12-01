import javax.swing.*;

public class Lab309 {
    public static void main(String[] args) {

        int total = 0;

        // Loop ใหญ่สำหรับการเริ่มโปรแกรมใหม่ (ตาม Source 80)
        while(true) {
            int start = JOptionPane.showConfirmDialog(null,
                    "Do you want to order menu?",
                    "Yakitori",
                    JOptionPane.YES_NO_OPTION);

            if(start != JOptionPane.YES_OPTION) {
                break; // จบโปรแกรม
            }

            total = 0; // รีเซ็ตราคาสำหรับรอบใหม่

            // Loop รับรายการอาหาร
            while(true) {
                String menuStr = JOptionPane.showInputDialog(
                        "Yakitori Menu:\n" +
                                "[1] Chicken Wing 99 B.\n" +
                                "[2] Pork with Leek 89 B.\n" +
                                "[3] Beef Tongue 109 B.\n" +
                                "[0] Exit and Calculate");

                // กรณี User กด Cancel หรือปิดหน้าต่าง
                if(menuStr == null) break;

                int menu = Integer.parseInt(menuStr);

                if (menu == 0) {
                    break;
                } else if (menu == 1) {
                    total += 99;
                } else if (menu == 2) {
                    total += 89;
                } else if (menu == 3) {
                    total += 109;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Menu Number!");
                }
            }

            // แสดงผลรวม
            JOptionPane.showMessageDialog(null, "Total Price: " + total + " Baht.");
        }
    }
}
