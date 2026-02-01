import javax.swing.*;

public class TicketBooking {

        public static String select_showtime(Movie movie) {
            String menu = movie.toString() +
                    "\nPress 1 to select show time = 13:00" +
                    "\nPress 2 to select show time = 14:30" +
                    "\nPress 3 to select show time = 15:00" +
                    "\nEnter a number:";
            String choice = JOptionPane.showInputDialog(null, menu, "Input", JOptionPane.QUESTION_MESSAGE);
            if (choice.equals("1")) return "13:00";
            if (choice.equals("2")) return "14:30";
            if (choice.equals("3")) return "15:00";
            return "Error time";
        }

        public static String select_seat_number() {
            String row = JOptionPane.showInputDialog(null, "Select seat row [A-G]:", "Input", JOptionPane.QUESTION_MESSAGE);
            String num = JOptionPane.showInputDialog(null, "Select seat number [1-12]:", "Input", JOptionPane.QUESTION_MESSAGE);
            return row.toUpperCase() + num;
        }

        public static void main(String[] args) {
            Movie movie = new Movie("Titanic", 120, "PG-13");
            String show_time = select_showtime(movie);
            String seat_number = select_seat_number();

            Ticket ticket = new Ticket("T001", movie, show_time, seat_number, 240.0);

            int confirm = JOptionPane.showConfirmDialog(null,
                    "Do you want to book a " + movie.getTitle() + " ticket?",
                    "Book Ticket", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, ticket.bookTicket());
            }

            JOptionPane.showMessageDialog(null, ticket.toString());
        }
    }
