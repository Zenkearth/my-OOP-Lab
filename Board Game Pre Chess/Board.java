public class Board {
    final private int tableSize = 10;

    private Figure[] playerFigures = new Figure[2];
    private Figure[] board = new Figure[tableSize];

    public Board() {
        playerFigures[0] = new Figure("P1", 0);
        playerFigures[1] = new Figure("P2", 1);
        for (Figure playFigure : playerFigures) {
            board[playFigure.getNowPosition()] = playFigure;
        }
    }

    public void displayBoard() {
        for (Figure figure : board) {
            if (figure != null) {
                System.out.println(figure.getName() + " is at position: " + (figure.getNowPosition() + 1));
            }
        }
    }

    public void printBoard() {
        for (Figure figure : board) {
            if (figure != null) {
                System.out.printf("[%s] ", figure.getName());
            } else {
                System.out.printf("[ ] ");
            }
        }
        System.out.println();
    }

    public void moveFigure(int playerNumber, int movePosition) {
        int playerIndex = playerNumber - 1;
        if (canMove(playerNumber, movePosition)) { 
            int currentPosition = playerFigures[playerIndex].getNowPosition();
            board[currentPosition] = null;
            playerFigures[playerIndex].setNowPosition(movePosition - 1);
            board[movePosition - 1] = playerFigures[playerIndex];
        } else {
            System.out.println("Invalid move. Please try again.");
        }
    }
    

    public boolean canMove(int playerIndex, int movePosition) {
        playerIndex--;
        movePosition--;
        if (playerIndex < 0 || playerIndex >= playerFigures.length) {
            return false;
        }
        if (movePosition < 0 || movePosition >= tableSize) {
            return false;
        }
        return board[movePosition] == null;
    }
}