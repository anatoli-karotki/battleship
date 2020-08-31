package dr.anatolik.model;

public class Cell {

    int number;
    boolean isPartOfShip;
    boolean isSelected;

    public Cell(int val) {
        this.number = val;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPartOfShip() {
        return isPartOfShip;
    }

    public void setPartOfShip(boolean partOfShip) {
        isPartOfShip = partOfShip;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
