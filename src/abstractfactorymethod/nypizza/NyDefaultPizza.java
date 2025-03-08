package abstractfactorymethod.nypizza;

import abstractfactorymethod.Pizza;
import abstractfactorymethod.ingredientfactory.NyPizzaIngredientFactory;
import abstractfactorymethod.ingredientfactory.PizzaIngredientFactory;

public class NyDefaultPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public NyDefaultPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "Ny default";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    public void prepare() {
        System.out.println("Preparing "+name+" pizza.");
        System.out.println(pizzaIngredientFactory.addDough());
        System.out.println(pizzaIngredientFactory.addCheese());
        System.out.println(pizzaIngredientFactory.addSauce());
    }
}
