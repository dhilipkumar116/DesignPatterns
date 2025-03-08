package abstractfactorymethod;

public abstract class Pizza {
    public String name;
    public abstract  void prepare();
    public void bake() {
        System.out.println("Baking "+ name+" pizza");
    }
    public void cut() {
        System.out.println("Cutting "+ name+" pizza");
    }
    public void box() {
        System.out.println("Boxing "+ name+" pizza");
    }
}
