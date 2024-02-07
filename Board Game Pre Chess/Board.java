public class Board {
    final private int tableSize = 10;

    private Figure[] playerFigures = new Figure[2];
    private int[] positionBuffer = new int[tableSize];

    public Board() {
        playerFigures[0] = new Figure("Player 1", 0);
        playerFigures[1] = new Figure("Player 2", 5);
        for (Figure playFigure : playerFigures) {
            positionBuffer[playFigure.getNowPosition()] = 1;
        }
    }

    public void displayBoard() {
        for (Figure figure : playerFigures) {
            System.out.println(figure.getName() + " is at position: " + (figure.getNowPosition() + 1));
        }
    }

    public void moveFigure(int playerIndex, int movePosition) {
        movePosition--;
        if (movePosition >= 1 && movePosition <= tableSize) {
            positionBuffer[playerFigures[playerIndex].getNowPosition()] = 0;
            playerFigures[playerIndex].setNowPosition(movePosition);
            positionBuffer[movePosition] = 1;
        } else {
            System.out.println("Invalid move. Please choose a position within the board limits.");
        }
    }    

    public void printPositionBuffer() {
        for (int i : positionBuffer) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}