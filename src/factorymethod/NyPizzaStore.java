package factorymethod;

import factorymethod.nypizza.NyCheesePizza;
import factorymethod.nypizza.NyDefaultPizza;

public class NyPizzaStore extends PizzaStore{
    public Pizza createPizza(String type) {
        if(type.equals("cheese")) {
            return new NyCheesePizza();
        }else{
            return new NyDefaultPizza();
        }
    }
}
