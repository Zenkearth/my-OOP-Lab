public class Player {
    public static void main(String[] args) {
        Board game = new Board();// create Board
        game.printBoard(); // display

        game.moveFigure(1, 3); // move player 1 from 1 to 3
        game.printBoard(); //display
        
        game.moveFigure(2, 4); // move player 2 from 5 to 3 : can't move
        game.printBoard(); //display
        
        game.moveFigure(1, 10); // move player 2 from 2 to 8
        game.printBoard(); //display
    }   
}
