import javax.swing.*;

public class TicketUsed {
    public static String show_movie_list(Ticket... tickets) {
        String list = "";
        for (Ticket t : tickets) {
            list += t.getTicket_id() + ": " + t.getMovie().toString() + "\n";
        }
        return list;
    }

    public static void main(String[] args) {
        Ticket[] tickets = new Ticket[] {
                new Ticket("T001", new Movie("Titanic", 120, "PG-13"), "12:00", "B7", 280),
                new Ticket("T002", new Movie("Pokemon", 102, "PG"), "11:00", "G11", 240),
                new Ticket("T003", new Movie("Silent Hill", 125, "R-13"), "14:30", "H2", 240)
        };

        int start = JOptionPane.showConfirmDialog(null, "Do you want to book or use a ticket?", "Ticket", JOptionPane.YES_NO_OPTION);

        if (start == JOptionPane.YES_OPTION) {
            boolean continueLoop = true;
            while (continueLoop) {
                String movie_list = show_movie_list(tickets);
                String idInput = JOptionPane.showInputDialog(null, movie_list + "\nEnter a ticket id for booking:");

                Ticket selected = null;
                for (Ticket t : tickets) {
                    if (t.getTicket_id().equalsIgnoreCase(idInput)) {
                        selected = t;
                        break;
                    }
                }

                if (selected != null) {
                    String menu = selected.getMovie().toString() +
                            "\nPress 1 to book a ticket" +
                            "\nPress 2 to use a ticket" +
                            "\nPress 3 to see a ticket status" +
                            "\nEnter a menu:";
                    String choice = JOptionPane.showInputDialog(null, menu);

                    if (choice.equals("1")) {
                        JOptionPane.showMessageDialog(null, selected.bookTicket());
                    } else if (choice.equals("2")) {
                        JOptionPane.showMessageDialog(null, selected.useTicket());
                    }

                    JOptionPane.showMessageDialog(null, selected.toString());

                    int again = JOptionPane.showConfirmDialog(null, "Do you want to book or use other tickets?", "Ticket", JOptionPane.YES_NO_OPTION);
                    if (again == JOptionPane.NO_OPTION) continueLoop = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Ticket ID not found.");
                    continueLoop = false;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "END PROGRAM");
    }
}
