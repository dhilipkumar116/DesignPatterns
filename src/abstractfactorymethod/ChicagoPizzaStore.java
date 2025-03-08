package abstractfactorymethod;

import abstractfactorymethod.chicagopizza.*;
import abstractfactorymethod.ingredientfactory.ChicagoPizzaIngredientFactory;
import abstractfactorymethod.ingredientfactory.NyPizzaIngredientFactory;
import abstractfactorymethod.ingredientfactory.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore{
    public Pizza createPizza(String type) {
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        if(type.equals("cheese")) {
            return new ChicagoCheesePizza(pizzaIngredientFactory);
        }else{
            return new ChicagoDefaultPizza(pizzaIngredientFactory);
        }
    }
}
