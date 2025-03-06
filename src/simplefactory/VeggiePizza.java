package simplefactory;

public class VeggiePizza implements Pizza{

    @Override
    public void bake() {
        System.out.println("baking veg pizza");
    }
    @Override
    public void prepare(){
        System.out.println("preparing veg pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting veg pizza");
    }

    @Override
    public void box() {
        System.out.println("boxing veg pizza");
    }
}
