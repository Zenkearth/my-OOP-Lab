import java.util.Scanner;

public class playground {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        MynaBird littlebird = new MynaBird("peter", 14, 50, false);
        while (true) {
            byte mode = Byte.parseByte(scn.nextLine());
            switch (mode) {
                case 1:
                    littlebird.getProp();
                    break;
                case 2:
                    littlebird.talk();
                    break;
                case 3:
                    littlebird.talk("Hello");
                    break;
                case 4:
                    littlebird.eat(10);
                    break;
                case 5:
                    littlebird.poop(5);
                    break;
                case 6:
                    littlebird.SwBirdType();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}