package Glass;

public class mainGlass {
    public static void main(String[] args) {
        glass ThisGlass1 = new glass("Glass1",200,200);
        glass ThisGlass2 = new glass("glass2",100,0);
        /*ThisGlass1.getComponent();
        ThisGlass1.addSomeWater(40);
        ThisGlass1.getComponent();
        ThisGlass1.pourAllWater();
        ThisGlass1.getComponent();
        ThisGlass1.addFullWater();
        ThisGlass1.getComponent();
        ThisGlass1.pourSomeWater(30);
        ThisGlass1.getComponent();

        System.out.println("\n\n\n\n");
        ThisGlass1.getComponent();
        ThisGlass2.getComponent();
        ThisGlass1.pourWaterToAnotherGlass(ThisGlass2,100);
        System.out.println("\n");*/


        ThisGlass1.getComponent();
        ThisGlass2.getComponent();
        ThisGlass1.pourWaterToAnotherGlassAll(ThisGlass2);
        ThisGlass1.getComponent();
        ThisGlass2.getComponent();
    }
}