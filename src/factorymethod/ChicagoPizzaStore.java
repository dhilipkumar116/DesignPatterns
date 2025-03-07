package factorymethod;

import factorymethod.PizzaStore;
import factorymethod.chicagopizza.ChicagoCheesePizza;
import factorymethod.chicagopizza.ChicagoDefaultPizza;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if(type.equals("cheese")) {
            return new ChicagoCheesePizza();
        }else{
            return new ChicagoDefaultPizza();
        }
    }
}
