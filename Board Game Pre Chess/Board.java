public class Board {
    final private int tableSize = 10;

    private Figure[] playerFigures = new Figure[2];
    private int[] positionBuffer = new int[tableSize];

    public Board() {
        playerFigures[0] = new Figure("Player 1", 0);
        playerFigures[1] = new Figure("Player 2", 5);
        for (Figure playFigure : playerFigures){
            positionBuffer[playFigure.getNowPosition()] = 1;
        }
    }

    public void displayBoard() {
        for (Figure figure : playerFigures) {
            System.out.println(figure.getName() + " is at position: " + figure.getNowPosition());
        }
    }   
     public void moveFigure(int playerIndex,int movePosition){
        if(movePosition >= 1 && movePosition <= tableSize){
            playerFigures[playerIndex].setNowPosition(movePosition);
        }
     }
}