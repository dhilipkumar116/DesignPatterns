package abstractfactorymethod.chicagopizza;

import abstractfactorymethod.Pizza;
import abstractfactorymethod.ingredientfactory.ChicagoPizzaIngredientFactory;
import abstractfactorymethod.ingredientfactory.PizzaIngredientFactory;

public class ChicagoCheesePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;
    public ChicagoCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "Chicago Cheese";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    public void prepare() {
        System.out.println("Preparing "+name+" pizza.");
        System.out.println(pizzaIngredientFactory.addDough());
        System.out.println(pizzaIngredientFactory.addCheese());
        System.out.println(pizzaIngredientFactory.addSauce());
    }
}
