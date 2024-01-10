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


    //-----------------------------------------------
    public void getComponent(){
        System.out.printf("This glass have %d capacity and %d water in this glass.",this.capacity,this.water);
    }

    public void addFullWater() {
        this.water = this.capacity;
    }
}
