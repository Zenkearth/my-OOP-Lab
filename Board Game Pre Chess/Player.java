public class Player {
    public static void main(String[] args) {
        Board game = new Board();// create Board

        //game.displayBoard(); //view position
        game.printBoard(); // display

        game.moveFigure(1, 3); // move player 1 from 1 to 3

        //game.displayBoard(); //view position
        game.printBoard(); //display
        
        game.moveFigure(1, 3); // move player 2 from 5 to 2
        //game.displayBoard(); //view position
        game.printBoard(); //display
        
        game.moveFigure(1, 10); // move player 2 from 2 to 8
        //game.displayBoard(); //view position
        game.printBoard(); //display
    }   
}
