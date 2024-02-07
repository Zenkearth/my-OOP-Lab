public class Player {
    public static void main(String[] args) {
        Board game = new Board();
        game.displayBoard();
        game.moveFigure(0, 3);
        System.out.println();
        game.displayBoard();
    }   
}
