public class MynaBird {
    private String name;
    private int age;
    private float weight;
    private float stomach = 0;
    private boolean isSpecial;

    public MynaBird(String name, int age, float weight, boolean isSpecial) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isSpecial = isSpecial;
    }

    public void getProp() {
        System.out.println("\nMy name is " + name);
        System.out.println("Age " + age);
        System.out.println("Weight " + weight);
        System.out.println("Stomach " + stomach + "\n");
    }

    public void talk(String speech) {
        System.out.println("\n" + speech);
    }

    public void talk() {
        System.out.println("\n" + age);
    }

    public void eat(float foodWeight) {
        if (foodWeight + this.stomach > weight) {
            this.stomach = 0;
            System.out.println("\nIt's too much food for a little bird :'(");
            System.out.println("Stomach is now " + stomach);

        } else {
            this.stomach += foodWeight;
            System.out.println("\nYummy yummy :)");
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

    public void SwBirdType() {
        this.isSpecial = !isSpecial;
        System.out.println("\nBird type has switched.\n");
    }
}