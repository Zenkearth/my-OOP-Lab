public abstract class Figure {

    private String name;
    private boolean isWhite;
    private int row;
    private int column;

    public Figure(String name, boolean isWhite, int row, int column) {
        this.name = name;
        this.isWhite = isWhite;
        this.row = row;
        this.column = column;
    }

    public String getName() {
        return name;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setPosition(int row, int column) {
        this.row = row;
        this.column = column;
    }

    protected boolean isSameColor(Figure other) {
        return this.isWhite == other.isWhite;
    }

    protected boolean isOnBoard(int row, int column) {
        return 0 <= row && row < 8 && 0 <= column && column < 8;
    }

    protected boolean isOccupied(ChessBoard board, int row, int column) {
        return board.getFigureAt(row, column) != null;
    }

    public abstract boolean freeMove(int destinationRow, int destinationColumn, ChessBoard board);
}