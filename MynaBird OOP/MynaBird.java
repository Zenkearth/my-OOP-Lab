import java.util.Random;

public class MynaBird {
    private String name;
    private int age;
    private float weight;
    private boolean isSpecial;
    private float stomach;

    private boolean isMale;

    public MynaBird(String name, int age, float weight, boolean isSpecial, boolean isMale) {
        if (age <= 0) {
            throw new IllegalArgumentException("The age should be more than 0.");
        }
        if (weight < 20) {
            throw new IllegalArgumentException("Weight should be more than 20.");
        }
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isSpecial = isSpecial;
        this.isMale = isMale;
        this.stomach = 0;
    }

    // -----------------------------------------------------------------------------
    public void getProp() {
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Stomach: " + stomach + "\n");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    public float getStomach() {
        return stomach;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setSpecial(boolean isSpecial) {
        this.isSpecial = isSpecial;
    }

    public void setStomach(float stomach) {
        this.stomach = stomach;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    // -----------------------------------------------------------------------------
    public void talk() {
        System.out.printf("I'm %d yrs old\n", this.age);
    }

    public void talk(String speech) {
        System.out.println("\n" + speech);
    }

    public void eat(float foodWeight) {
        if (foodWeight + this.stomach > weight) {
            this.stomach = 0;
            System.out.println("\nIt's too much food for a little bird :'(");
            System.out.println("Stomach is now " + stomach);

        } else {
            this.stomach += foodWeight;
            System.out.println("\nEating " + foodWeight + " units of food.");
            System.out.println("Stomach is now " + stomach);
        }
    }

    public void poop(float poopWeight) {
        String takeOut = isSpecial ? "food" : "poop";
        if (stomach >= poopWeight) {
            this.stomach -= poopWeight;
            System.out.println("\nWhat did you take out?\n" + takeOut + " !!!!" + "\nStomach is now " + stomach);
        } else {
            this.stomach = 0;
            System.out.println("\nEmpty stomuch");
        }
    }

    public void swBirdType() {
        this.isSpecial = !this.isSpecial;
        System.out.println("\nBird type switched.");
    }

    public MynaBird haveSex(MynaBird anotheBird) {
        MynaBird babyBird = null;
        if (this.isMale == anotheBird.isMale) {
            System.out.println("Unable to have sexual relations because they are of the same gender.");
        } else {
            Random random = new Random();
            babyBird = new MynaBird(this.name.charAt(0) + "" + anotheBird.getName().charAt(0), 1, 20,
                    this.isSpecial == anotheBird.isSpecial() ? true
                            : (this.isSpecial || anotheBird.isSpecial() ? random.nextBoolean() : false),
                    random.nextBoolean());
        }
        return babyBird;
    }
}