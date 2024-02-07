public class mainMynaBird {
    public static void main(String[] args) {
        try {
            // Create a MynaBird instance
            MynaBird littlebird = new MynaBird("Peter", 5, 30, false, true);

            // Test Case 1: Print properties
            littlebird.getProp();
            System.out.println("------------------------------------------------------------------");

            // Test Case 2: Default talk
            littlebird.talk();
            System.out.println("------------------------------------------------------------------");

            // Test Case 3: Custom talk
            littlebird.talk("Hello, I am a Myna Bird!");
            System.out.println("------------------------------------------------------------------");

            // Test Case 4: Eating (normal)
            littlebird.eat(5); // Eat 5 units of food
            System.out.println("------------------------------------------------------------------");

            // Test Case 5: Overeating
            littlebird.eat(100); // Attempt to overeat
            System.out.println("------------------------------------------------------------------");

            // Test Case 6: Pooping
            littlebird.poop(3); // Poop 3 units
            System.out.println("------------------------------------------------------------------");

            // Test Case 7: Switching Bird Type
            littlebird.swBirdType();
            System.out.println("------------------------------------------------------------------");

            // Test Case 8: Another poop after switching type
            littlebird.eat(30);
            littlebird.poop(20);
            System.out.println("------------------------------------------------------------------");

            // Test Case 9: Check properties again
            littlebird.getProp();
            System.out.println("------------------------------------------------------------------");

            // Test Case 10: have sex
            MynaBird girlFrieBird = new MynaBird("Lisa", 4, 30, true, false);
            MynaBird baby = girlFrieBird.haveSex(littlebird);
            baby.getProp();
            System.out.println("------------------------------------------------------------------");

            // Test Case 10: have sex
            MynaBird boyFrieBird = new MynaBird("Tom", 4, 30, true, true);
            MynaBird birddd = littlebird.haveSex(boyFrieBird);
            if (birddd != null) {
                birddd.getProp();
            }
            System.out.println("------------------------------------------------------------------");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}