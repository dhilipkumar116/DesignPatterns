package abstractfactorymethod.ingredientfactory;

import abstractfactorymethod.ingredientfactory.ingredient.cheese.Cheese;
import abstractfactorymethod.ingredientfactory.ingredient.cheese.MozzarellaCheese;
import abstractfactorymethod.ingredientfactory.ingredient.dough.Dough;
import abstractfactorymethod.ingredientfactory.ingredient.dough.ThickCrushDough;
import abstractfactorymethod.ingredientfactory.ingredient.sauce.ChillySauce;
import abstractfactorymethod.ingredientfactory.ingredient.sauce.Sauce;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough addDough() {
        return new ThickCrushDough();
    }
    public Cheese addCheese() {
        return new MozzarellaCheese();
    }
    public Sauce addSauce() {
        return new ChillySauce();
    }
}
