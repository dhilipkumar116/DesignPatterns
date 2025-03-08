package abstractfactorymethod.chicagopizza;

import abstractfactorymethod.Pizza;
import abstractfactorymethod.ingredientfactory.ChicagoPizzaIngredientFactory;
import abstractfactorymethod.ingredientfactory.PizzaIngredientFactory;

public class ChicagoDefaultPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public ChicagoDefaultPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "Chicago Default";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    public void prepare() {
        System.out.println("Preparing "+name+" pizza.");
        System.out.println(pizzaIngredientFactory.addDough());
        System.out.println(pizzaIngredientFactory.addCheese());
        System.out.println(pizzaIngredientFactory.addSauce());
    }
}
