package dr.anatolik.view;

import dr.anatolik.model.Cell;
import dr.anatolik.model.Grid;

public class Printer {

    public String printGrid(Grid grid) {
        String gridView = "|";
        int lineLimit = 10;
        for (Cell cell : grid.getCells()) {
            gridView = gridView + addCell(cell);
            if (--lineLimit == 0) {
                gridView = gridView + ("\n|");
                lineLimit = 10;
            }
        }
        return gridView.substring(0, gridView.length() - 1);
    }

    private String addCell(Cell cell) {
        String cellView = getSeparator(cell);
        if (cell.getNumber() < 10) {
            cellView = " " + cellView;
        }
        return cellView + cell.getNumber() + getSeparator(cell) + "|";
    }

    private String getSeparator(Cell cell) {
        if (cell.isSelected()) {
            return "*";
        }
        return " ";
    }
}
