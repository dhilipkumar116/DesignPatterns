package factorymethod;

public class Main {


    /*
    *  encapsulate object creation to keep applications
    *  loosely coupled and less dependent
    *  on implementations,
    *
    *
    * I’m Factory Method; use me to
        decouple your client code from the concrete classes you
        need to instantiate, or if you don’t know ahead of time all
        the concrete classes you are going to need. To use me, just
        subclass me and implement my factory method!
    *
    *
    * */

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NyPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
