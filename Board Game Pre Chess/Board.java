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
        for (Figure figure : board) { // เปลี่ยนจาก playerFigures เป็น board
            if (figure != null) { // เพิ่มการตรวจสอบว่าไม่เป็น null
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

    public void moveFigure(int playerIndex, int movePosition) {
        if (canMove(playerIndex, movePosition - 1)) { // ลบ 1 เพื่อแปลงจาก position ให้เป็น index
            int currentPosition = playerFigures[playerIndex].getNowPosition();
            board[currentPosition] = null; // ลบ figure จากตำแหน่งเดิม
            playerFigures[playerIndex].setNowPosition(movePosition - 1); // ลบ 1 เพื่อแปลงจาก position ให้เป็น index
            board[movePosition - 1] = playerFigures[playerIndex]; // เพิ่ม figure ไปยังตำแหน่งใหม่
        } else {
            System.out.println("Invalid move. Please try again.");
        }
    }
    

    public boolean canMove(int playerIndex, int movePosition) {
        movePosition--; // ปรับตำแหน่งให้เป็น index ของ array
        // ตรวจสอบว่า index ของผู้เล่นถูกต้อง และ movePosition อยู่ในขอบเขตของบอร์ด
        if (playerIndex < 0 || playerIndex >= playerFigures.length) {
            return false; // playerIndex ไม่ถูกต้อง
        }
        if (movePosition < 0 || movePosition >= tableSize) {
            return false; // movePosition ไม่อยู่ในขอบเขตของบอร์ด
        }
        // ตรวจสอบว่าตำแหน่งที่ต้องการย้ายไปว่างอยู่
        return board[movePosition] == null;
    }

}