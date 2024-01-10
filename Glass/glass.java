package Glass;

public class glass {
    private int capacity, water;

    public glass(int capacity, int water) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0 only.");
        }
        this.capacity = capacity;
        if (water < 0 || water > capacity) {
            throw new IllegalArgumentException("Water can't be negative or greater than capacity.");
        }
        this.water = water;

    }

    // getComponent-----------------------------------------------
    public void getComponent() {
        System.out.printf("This glass have %d capacity and %d water in this glass.\n", this.capacity, this.water);
    }
    public int getWater(){
        return this.water;
    }
    // addWater-----------------------------------------------

    public void addFullWater() {
        System.out.printf("Add Full water to the glass\n");
        this.water = this.capacity;
    }
    
    public void addSomeWater(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Kuy nahee Water tid lob");
        }
        if (value + this.water <= this.capacity) {
            System.out.printf("Add water to the amount of %d ml.\n", value);
            this.water += value;
        } else {
            System.out.printf("Add water to the amount of %d ml.\n", value);
            this.water = this.capacity;
        }
    }
    // pourWater--------------------------------------------------------
    public void pourAllWater(){
        System.out.printf("Pour all water to the glass\n");
        this.water = 0;
    }
    public void pourSomeWater(int value){
        if (value < 0) {
            throw new IllegalArgumentException("Kuy nahee Water tid lob");
        }
        if (this.water - value >= 0) {
            System.out.printf("Pour some to the amount of %d ml.\n", value);
            this.water -= value;
        } else {
            System.out.printf("Pour some to the amount of %d ml.\n", value);
            this.water = 0;
        }
    }
    //------------------------------------------------------------------
    public void pourWaterToAnotherGlass(glass anotherGlass,int value){
        System.out.println("Pour water from this glass to another glass");
        this.pourSomeWater(value);
        System.out.println("Add water from that glass to this glass");
        anotherGlass.addSomeWater(value);
    }
}