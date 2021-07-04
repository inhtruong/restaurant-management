package Restaurant;

public class Table {
    private static boolean occupied;

    public Table() {

    }

    public Table(boolean occupied) {
        this.occupied = occupied;
    }

    public static boolean isOccupied() {
        return occupied;
    }

    public void bookOrder(Table table) {
        occupied = true;
    }

    public void releaseOrder(Table table) {
        occupied = false;
    }
}
