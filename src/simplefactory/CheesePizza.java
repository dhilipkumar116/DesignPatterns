package simplefactory;

public class CheesePizza implements  Pizza{
    @Override
    public void bake() {
        System.out.println("baking cheese pizza");
    }
    @Override
    public void prepare(){
        System.out.println("preparing cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting cheese pizza");
    }

    @Override
    public void box() {
        System.out.println("boxing cheese pizza");
    }
}
