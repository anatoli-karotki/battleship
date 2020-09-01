package dr.anatolik.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GridTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 5, 99})
    public void emptyGridTest(int expectedNumberOfShips) {
        Grid grid = new Grid(expectedNumberOfShips);
        AtomicInteger actualNumberOfShips = new AtomicInteger();
        grid.getCells().forEach(
                cell -> {
                    if (cell.isPartOfShip) actualNumberOfShips.getAndIncrement();
                });
        assertEquals(expectedNumberOfShips, actualNumberOfShips.get());
    }
}
