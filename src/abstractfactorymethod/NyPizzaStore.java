package abstractfactorymethod;

import abstractfactorymethod.ingredientfactory.NyPizzaIngredientFactory;
import abstractfactorymethod.ingredientfactory.PizzaIngredientFactory;
import abstractfactorymethod.nypizza.*;

public class NyPizzaStore extends PizzaStore{
    public Pizza createPizza(String type) {
        PizzaIngredientFactory pizzaIngredientFactory = new NyPizzaIngredientFactory();
        if(type.equals("cheese")) {
            return new NyCheesePizza(pizzaIngredientFactory);
        }else{
            return new NyDefaultPizza(pizzaIngredientFactory);
        }
    }
}
