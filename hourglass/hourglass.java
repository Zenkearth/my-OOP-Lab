package hourglass;

public class hourglass {
    private int sandA, sandB, sideA;
    private int FLOWSPEED;

    public hourglass(int sandA, int sandB, int sideA,int FLOWSPEED) {
        if (sandA < 0 || sandB < 0) {
            throw new IllegalArgumentException("sandA or sandB can't be negative !");
        }
        if (sideA < 1 || sideA > 4) {
            throw new IllegalArgumentException("sideA must be in rage 1-4 !");
        }
        this.sandA = sandA;
        this.sandB = sandB;
        this.sideA = sideA;
        this.FLOWSPEED = FLOWSPEED;

        System.out.println("\nStart....\n");
        if ((this.sideA == 1 && this.sandA != 0) || (this.sideA == 3 && this.sandB != 0)) {
            System.out.println("-----------Initialize-----------");
            printSide();
            flowingSand();
            System.out.println("--------------DONE--------------\n\n");
        }
    }

    // getMedthod

    private void printSide() {
        System.out.printf("SideA : %-6d | sideB : %-6d\n", sideA, getsideB(sideA));
        if (this.sideA == 2 || this.sideA == 4) {
            System.out.println(" # Now is on Horizontal axis #");
        } else {
            System.out.println("  # Now is on Vertical axis #");

        }
    }

    public int getSandA() {
        return this.sandA;
    }

    public int getSandB() {
        return this.sandB;
    }

    public int getsideA() {
        return this.sideA;
    }

    private int getsideB(int side) {
        switch (side) {
            case 1:
                side = 3;
                break;
            case 2:
                side = 4;
                break;
            case 3:
                side = 1;
                break;
            case 4:
                side = 2;
                break;
        }
        return side;
    }

    // glassHour is here

    private void movesideA() {
        if (this.sideA == 4) {
            this.sideA = 1;
        } else {
            sideA++;
        }
    }

    public void rotate90() {
        System.out.println("--------------------------------\n       Rotate 90 degree");
        movesideA();
        printSide();
        flowingSand();
        System.out.println("--------------------------------");
    }

    public void rotate180() {
        System.out.println("--------------------------------\n       Rotate 180 degree");
        this.sideA = getsideB(sideA);
        printSide();
        flowingSand();
        System.out.println("--------------------------------");
    }
    private void flowingSand() {
        try {
            if (this.sideA == 1 && this.sandA != 0) {
                System.out.println("\nflowing...");
                System.out.printf("sandA : %-6d | sandB : %-6d", sandA, sandB);
                while (this.sandA > 0) {
                    Thread.sleep(1000); 
                    if ((sandA - FLOWSPEED) >= 0) {
                        this.sandA -= FLOWSPEED;
                        this.sandB += FLOWSPEED;
                    } else {
                        this.sandB += this.sandA;
                        this.sandA = 0;
                    }
                    System.out.printf("\nsandA : %-6d | sandB : %-6d", sandA, sandB);
                }
                System.out.println();
            } else if (this.sideA == 3 && this.sandB != 0) {
                System.out.println("\nflowing...");
                System.out.printf("sandA : %-6d | sandB : %-6d", sandA, sandB);
                while (sandB > 0) {
                    Thread.sleep(1000); 
                    if ((sandB - FLOWSPEED) >= 0) {
                        this.sandB -= FLOWSPEED;
                        this.sandA += FLOWSPEED;
                    } else {
                        this.sandA += this.sandB;
                        this.sandB = 0;
                    }
                    System.out.printf("\nsandA : %-6d | sandB : %-6d", sandA, sandB);
                }
                System.out.println();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Flow was interrupted");
        }
    }
    
}