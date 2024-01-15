package Glass;

public class mainGlass {
        public static void main(String[] args) {
                glass t1 = new glass("Glass1", 200, 0);
                glass t2 = new glass("Glass2", 100, 50);
                // test 1 add full water
                t1.addFullWater();
                System.out.printf("Test 1 : Add full water in Glass1 >> water must be 200 : \n\tThe %s have %d water\n",
                                t1.getName(), t1.getWater());

                // test 2 add some water
                t2.addSomeWater(30);
                System.out.printf("Test 2 : Add some water in Glass2 >> water must be 80 : \n\tThe %s have %d water\n",
                                t2.getName(), t2.getWater());

                // test 3 pour some water to ground
                t1.pourSomeWater(100);
                System.out.printf(
                                "Test 3 : Pour some water to the ground >> water must be 100 : \n\tThe %s have %d water\n",
                                t1.getName(), t1.getWater());

                // test 4 pour all water to ground
                t2.pourAllWater();
                System.out.printf(
                                "Test 4 : Pour all water to the ground >> water must be 0 : \n\tThe %s have %d water\n",
                                t2.getName(), t2.getWater());

                // test 5 pour some water to another glass
                t1.pourWaterToAnotherGlass(t2, 50);
                System.out.printf(
                                "Test 5 : Pour some water to another glass >> water must be 50 at both glass : \n\tThe %s have %d water\n\tThe %s have %d water\n"
                                                + //
                                                "",
                                t1.getName(), t1.getWater(),
                                t2.getName(), t2.getWater());

                // test 6 pour all water to anotherr glass
                t1.pourWaterToAnotherGlassAll(t2);
                System.out.printf(
                                "Test 5 : Pour all water to another glass >> water must be 0 at glass1 & be 100 at glass2 : \n\tThe %s have %d water\n\tThe %s have %d water\n"
                                                + //
                                                "",
                                t1.getName(), t1.getWater(),
                                t2.getName(), t2.getWater());

                // Test 7: Attempt to pour more water than is available in the glass
                System.out.println("Test 7: Attempt to pour more water than is available in Glass1");
                try {
                        t1.pourSomeWater(20);
                        System.out.printf("\tUnexpected success: The %s now has %d water\n", t1.getName(),t1.getWater());
                } catch (Exception e) {
                        System.out.printf("\tExpected failure: %s\n", e.getMessage());
                }
        }
}