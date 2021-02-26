public class Cinema {

    private final Seat[][] seats;

    public Cinema(Seat[][] seats) {
        this.seats = seats;
    }

    public Cinema(int rows, int seatsOfRow) {
        Seat[][] seats = new Seat[rows][seatsOfRow];
        for (int j = 0; j < rows; j++) {
            for (int k = 0; k < seatsOfRow; k++) {
                seats[j][k] = new Seat();
            }
        }
        this.seats = seats;
    }

    public Seat[][] getSeats() {
        return seats;
    }

    public int getQuantityRows() {
        return seats.length;
    }

    public int getQuantitySeatsOfRow() {
        return seats[0].length;
    }

    public static void main(String[] args) {
        Cinema cinema = new Cinema(7, 8);
        View.show(cinema);
    }
}
