package dr.anatolik.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Grid {

    private List<Cell> cells;

    public Grid(int numberOfShips) {
        initGrid(numberOfShips);
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void updateCell(int cellName) {
        for (Cell cell : cells) {
            if (cell.getNumber() == cellName) {
                if (!cell.isSelected) {
                    cell.setSelected(true);
                }
                break;
            }
        }
    }

    private void initGrid(int numberOfShips) {
        createGrid();
        setUpShips(numberOfShips);
    }

    private void createGrid() {
        this.cells = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            cells.add(new Cell(i));
        }
    }

    private void setUpShips(int numberOfShips) {
        Random r = new Random();
        for (int i = 0; i < numberOfShips; i++) {
            while (true) {
                int cellNumber = r.nextInt(100);
                Cell targetCell = cells.get(cellNumber);
                if (!targetCell.isPartOfShip) {
                    targetCell.setPartOfShip(true);
                    break;
                }
            }
        }
    }
}
