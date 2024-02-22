public class DummyFigure extends Figure {
    public DummyFigure(String name, boolean isWhite, int row, int column) {
        super(name, isWhite, row, column);
    }

    @Override
    public boolean freeMove(int destinationRow, int destinationColumn, ChessBoard board) {
        return true;
    }
}