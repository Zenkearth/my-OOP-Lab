package Glass;

public class glass {
    private String glassName;
    private int capacity, water;

    public glass(String glassName, int capacity, int water) {
        this.glassName = glassName;
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
        System.out.printf("%s have %d capacity and %d water in this glass.\n", glassName, this.capacity, this.water);
    }

    public int getWater() {
        return this.water;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getName() {
        return this.glassName;
    }

    // addWater-----------------------------------------------

    public void addFullWater() {
        //System.out.printf("Add Full water to the glass\n");
        this.water = this.capacity;
    }

    public void addSomeWater(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Water negative !!");
        }
        if (value + this.water <= this.capacity) {
            this.water += value;
        } else {
            this.water = this.capacity;

        }
    }

    // pourWater--------------------------------------------------------
    public void pourAllWater() {
        //System.out.printf("Pour all water to the glass\n");
        this.water = 0;
    }

    public void pourSomeWater(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Water negative !!");
        }
        if (this.water - value >= 0) {
            this.water -= value;
        } else {
            this.water = 0;
        }
    }

    // ------------------------------------------------------------------
    public void pourWaterToAnotherGlass(glass anotherGlass, int value) {
        // System.out.printf("\nPour %d water from %s glass to another glass\n\n", value, this.glassName);
        this.pourSomeWater(value);
        anotherGlass.addSomeWater(value);
    }

    public void pourWaterToAnotherGlassAll(glass anothergGlass) {
        // System.out.println("\nPour all water from this glass to another glass\n");
        anothergGlass.addSomeWater(this.getWater());
        this.pourAllWater();
    }
}