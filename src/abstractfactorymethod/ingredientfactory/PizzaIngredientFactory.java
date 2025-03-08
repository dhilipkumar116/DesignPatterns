package abstractfactorymethod.ingredientfactory;

import abstractfactorymethod.ingredientfactory.ingredient.cheese.Cheese;
import abstractfactorymethod.ingredientfactory.ingredient.dough.Dough;
import abstractfactorymethod.ingredientfactory.ingredient.sauce.Sauce;

public interface PizzaIngredientFactory {
    public Dough addDough();
    public Cheese addCheese();
    public Sauce addSauce();
}
