public class View {
    static void show(Cinema cinema) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cinema:").append('\n').append("  ");
        for (int i = 0; i < cinema.getQuantitySeatsOfRow(); i++) {
            stringBuilder.append(i + 1);
            if (i < cinema.getQuantitySeatsOfRow() - 1) {
                stringBuilder.append(" ");
            }
        }
        stringBuilder.append('\n');
        for (int k = 0; k < cinema.getQuantityRows(); k++) {
            stringBuilder.append(k + 1).append(" ");
            for (int j = 0; j < cinema.getQuantitySeatsOfRow(); j++) {
                stringBuilder.append(cinema.getSeats()[k][j].getStatusOfSeat().getView());
                if (j < cinema.getQuantitySeatsOfRow() - 1) {
                    stringBuilder.append(" ");
                }
            }
            stringBuilder.append('\n');
        }
        System.out.println(stringBuilder);
    }
}
