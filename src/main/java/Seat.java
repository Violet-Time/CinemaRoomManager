public class Seat {
    public enum StatusOfSeat {
        FREE("S");

        private String view;

        StatusOfSeat(String view) {
            this.view = view;
        }

        public String getView() {
            return this.view;
        }
    }

    private StatusOfSeat statusOfSeat;

    Seat() {
        this(StatusOfSeat.FREE);
    }

    Seat(StatusOfSeat statusOfSeat) {
        this.statusOfSeat = statusOfSeat;
    }

    public StatusOfSeat getStatusOfSeat() {
        return statusOfSeat;
    }

    public void setStatusOfSeat(StatusOfSeat statusOfSeat) {
        this.statusOfSeat = statusOfSeat;
    }
}
