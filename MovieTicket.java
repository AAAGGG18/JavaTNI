public class MovieTicket {

    public class Ticket {

        private String ticket_id;
        private Movie movie;
        private String show_time;
        private String seat_number;
        private double price;
        private boolean is_booked;
        private boolean is_used;

        public Ticket() {
            this.ticket_id = "";
            this.movie = null;
            this.show_time = "";
            this.seat_number = "";
            this.price = 0.0;
            this.is_booked = false;
            this.is_used = false;
        }

        public Ticket(String ticket_id, Movie movie, String show_time,
                      String seat_number, double price) {
            this.ticket_id = ticket_id;
            this.movie = movie;
            this.show_time = show_time;
            this.seat_number = seat_number;
            this.price = price;
            this.is_booked = false;
            this.is_used = false;
        }

        public String getTicket_id() {
            return ticket_id;
        }

        public Movie getMovie() {
            return movie;
        }

        public String bookTicket() {
            if (!is_booked) {
                is_booked = true;
                return "Ticket booked successfully!!";
            }
            return "This ticket is already booked";
        }

        public String useTicket() {
            if (!is_booked) {
                return "Please book the ticket first";
            }
            if (is_used) {
                return "Ticket already used";
            }
            is_used = true;
            return "Enjoy the movie!!";
        }

        @Override
        public String toString() {
            return "Ticket Id: " + ticket_id + "\n"
                    + "Movie: " + movie + "\n"
                    + "Show Time: " + show_time + "\n"
                    + "Seat Number: " + seat_number + "\n"
                    + "Ticket Price: " + price + "\n"
                    + "Booked: " + (is_booked ? "Yes" : "No") + "\n"
                    + "Used: " + (is_used ? "Yes" : "No");
        }

        public class Movie {

            private String title;
            private int minutes;
            private String rating;

            public Movie() {
                this.title = "";
                this.minutes = 0;
                this.rating = "";
            }

            public Movie(String title, int minutes, String rating) {
                this.title = title;
                this.minutes = minutes;
                this.rating = rating;
            }

            public String getTitle() {
                return title;
            }

            @Override
            public String toString() {
                return title + " (" + rating + ", " + minutes + " mins)";
            }
        }
    }
}
