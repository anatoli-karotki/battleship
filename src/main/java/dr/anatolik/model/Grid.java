package dr.anatolik.model;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    private List<Cell> cells;

    public Grid() {
        initGrid();
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void updateCell(int cellName) {
        for (Cell cell : cells) {
            if (cell.getNumber() == cellName) {
                cell.setSelected(!cell.isSelected);
                break;
            }
        }
    }

    private void initGrid() {
        this.cells = new ArrayList<Cell>();
        for (int i = 0; i < 100; i++) {
            cells.add(new Cell(i));
        }
    }
}
