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
        if (cell.isSelected()) {
            String cellView = "  ";
            if (cell.isPartOfShip()) {
                cellView += "x";
            } else {
                cellView += "-";
            }
            cellView += " |";
            return cellView;
        }
        return addDefaultCell(cell);
    }

    private String addDefaultCell(Cell cell) {
        String cellView = " ";
        if (cell.getNumber() < 10) {
            cellView = " " + cellView;
        }
        return cellView + cell.getNumber() + " |";
    }
}
