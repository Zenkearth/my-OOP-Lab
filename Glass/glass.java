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
        this.water = 0;
    }

    public void pourSomeWater(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Negative or zero value not allowed");
        }
        if (value > this.water) {
            throw new IllegalStateException("Insufficient water available");
        }
        this.water -= value;
    }
    

    // ------------------------------------------------------------------
    public void pourWaterToAnotherGlass(glass anotherGlass, int value) {
        this.pourSomeWater(value);
        anotherGlass.addSomeWater(value);
    }

    public void pourWaterToAnotherGlassAll(glass anothergGlass) {
        anothergGlass.addSomeWater(this.getWater());
        this.pourAllWater();
    }
}