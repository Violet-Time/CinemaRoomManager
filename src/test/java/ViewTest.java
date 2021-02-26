import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class ViewTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


    String shouldView = "Cinema:\n" +
            "  1 2 3 4 5 6 7 8\n" +
            "1 S S S S S S S S\n" +
            "2 S S S S S S S S\n" +
            "3 S S S S S S S S\n" +
            "4 S S S S S S S S\n" +
            "5 S S S S S S S S\n" +
            "6 S S S S S S S S\n" +
            "7 S S S S S S S S";

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void view() {
        Cinema cinema = new Cinema(7, 8);
        View.show(cinema);
        assertEquals(shouldView, outputStreamCaptor.toString().trim());
    }
}
