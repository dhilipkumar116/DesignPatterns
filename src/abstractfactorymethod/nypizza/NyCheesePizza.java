package abstractfactorymethod.nypizza;

import abstractfactorymethod.Pizza;
import abstractfactorymethod.ingredientfactory.ChicagoPizzaIngredientFactory;
import abstractfactorymethod.ingredientfactory.NyPizzaIngredientFactory;
import abstractfactorymethod.ingredientfactory.PizzaIngredientFactory;

public class NyCheesePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;
    public NyCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "Ny Cheese";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    public void prepare() {
        System.out.println("Preparing "+name+" pizza.");
        System.out.println(pizzaIngredientFactory.addDough());
        System.out.println(pizzaIngredientFactory.addCheese());
        System.out.println(pizzaIngredientFactory.addSauce());
    }}
