package dr.anatolik.view;


import dr.anatolik.model.Grid;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PrinterTest {

    private final Printer printer = new Printer();
    private Grid grid;

    @BeforeEach
    public void initGrid() {
        grid = new Grid(0);
    }

    @Test
    public void initialGridTest() {
        String actual = printer.printGrid(grid);
        String expected = "|  0 |  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 |\n" +
                "| 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 |\n" +
                "| 20 | 21 | 22 | 23 | 24 | 25 | 26 | 27 | 28 | 29 |\n" +
                "| 30 | 31 | 32 | 33 | 34 | 35 | 36 | 37 | 38 | 39 |\n" +
                "| 40 | 41 | 42 | 43 | 44 | 45 | 46 | 47 | 48 | 49 |\n" +
                "| 50 | 51 | 52 | 53 | 54 | 55 | 56 | 57 | 58 | 59 |\n" +
                "| 60 | 61 | 62 | 63 | 64 | 65 | 66 | 67 | 68 | 69 |\n" +
                "| 70 | 71 | 72 | 73 | 74 | 75 | 76 | 77 | 78 | 79 |\n" +
                "| 80 | 81 | 82 | 83 | 84 | 85 | 86 | 87 | 88 | 89 |\n" +
                "| 90 | 91 | 92 | 93 | 94 | 95 | 96 | 97 | 98 | 99 |\n";
        assertEquals(expected, actual);
    }

    @Test
    public void missedShotGridTest() {
        grid.getCells().get(0).setSelected(true);
        grid.getCells().get(99).setSelected(true);
        String actual = printer.printGrid(grid);
        String expected = "|  - |  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 |\n" +
                "| 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 |\n" +
                "| 20 | 21 | 22 | 23 | 24 | 25 | 26 | 27 | 28 | 29 |\n" +
                "| 30 | 31 | 32 | 33 | 34 | 35 | 36 | 37 | 38 | 39 |\n" +
                "| 40 | 41 | 42 | 43 | 44 | 45 | 46 | 47 | 48 | 49 |\n" +
                "| 50 | 51 | 52 | 53 | 54 | 55 | 56 | 57 | 58 | 59 |\n" +
                "| 60 | 61 | 62 | 63 | 64 | 65 | 66 | 67 | 68 | 69 |\n" +
                "| 70 | 71 | 72 | 73 | 74 | 75 | 76 | 77 | 78 | 79 |\n" +
                "| 80 | 81 | 82 | 83 | 84 | 85 | 86 | 87 | 88 | 89 |\n" +
                "| 90 | 91 | 92 | 93 | 94 | 95 | 96 | 97 | 98 |  - |\n";
        assertEquals(expected, actual);
    }

    @Test
    public void successShotGridTest() {
        grid.getCells().get(0).setPartOfShip(true);
        grid.getCells().get(0).setSelected(true);
        String actual = printer.printGrid(grid);
        String expected = "|  x |  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 |\n" +
                "| 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 |\n" +
                "| 20 | 21 | 22 | 23 | 24 | 25 | 26 | 27 | 28 | 29 |\n" +
                "| 30 | 31 | 32 | 33 | 34 | 35 | 36 | 37 | 38 | 39 |\n" +
                "| 40 | 41 | 42 | 43 | 44 | 45 | 46 | 47 | 48 | 49 |\n" +
                "| 50 | 51 | 52 | 53 | 54 | 55 | 56 | 57 | 58 | 59 |\n" +
                "| 60 | 61 | 62 | 63 | 64 | 65 | 66 | 67 | 68 | 69 |\n" +
                "| 70 | 71 | 72 | 73 | 74 | 75 | 76 | 77 | 78 | 79 |\n" +
                "| 80 | 81 | 82 | 83 | 84 | 85 | 86 | 87 | 88 | 89 |\n" +
                "| 90 | 91 | 92 | 93 | 94 | 95 | 96 | 97 | 98 | 99 |\n";
        assertEquals(expected, actual);
    }
}
