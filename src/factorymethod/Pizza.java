package factorymethod;

public abstract class Pizza {
    public String name;
    public void prepare() {
        System.out.println("preparing..."+name+" pizza");
    }
    public void bake() {
        System.out.println("baking..."+name+" pizza");
    }
    public void cut(){
        System.out.println("cutting..."+name+" pizza");
    }
    public void box(){
        System.out.println("boxing..."+name+" pizza");
    }
}
