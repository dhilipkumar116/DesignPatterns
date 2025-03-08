package abstractfactorymethod;

public class Main {

    /*
    *
    * encapsulate object creation to keep applications loosely coupled,
    * and less dependent on implementations.
    *
    * Abstract Factory, and use me whenever you have families of
        products you need to create, and you want to make sure
        your clients create products that belong together.
    *
    *
    * */

    public static void main(String[] args) {
        PizzaStore pizzaStore1 = new NyPizzaStore();
        pizzaStore1.orderPizza("cheese");

        PizzaStore pizzaStore2 = new ChicagoPizzaStore();
        pizzaStore2.orderPizza("asdfd");
    }
}
