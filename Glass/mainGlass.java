package Glass;

public class mainGlass {
    public static void main(String[] args) {
        glass t1 = new glass("Glass1", 200, 200);
        glass t2 = new glass("Glass2", 100, 60);
        t1.pourWaterToAnotherGlass(t2,30);
        t1.getComponent();
        t2.getComponent();
        
    }
}