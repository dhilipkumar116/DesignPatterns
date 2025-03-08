package abstractfactorymethod.ingredientfactory;

import abstractfactorymethod.ingredientfactory.ingredient.cheese.Cheese;
import abstractfactorymethod.ingredientfactory.ingredient.cheese.ReggianoCheese;
import abstractfactorymethod.ingredientfactory.ingredient.dough.Dough;
import abstractfactorymethod.ingredientfactory.ingredient.dough.ThinCrushDough;
import abstractfactorymethod.ingredientfactory.ingredient.sauce.Sauce;
import abstractfactorymethod.ingredientfactory.ingredient.sauce.TomatoSauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough addDough() {
        return new ThinCrushDough();
    }
    public Cheese addCheese() {
        return new ReggianoCheese();
    }
    public Sauce addSauce() {
        return new TomatoSauce();
    }
}
