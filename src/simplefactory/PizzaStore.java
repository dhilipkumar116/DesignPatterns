package simplefactory;

public class PizzaStore {

    PizzaFactory pizzaFactory;
    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public void orderPizza(String type) {
        try{
            Pizza pizza = pizzaFactory.createPizza(type);
            pizza.bake();
            pizza.cut();
            pizza.box();
        }catch (InvalidInputException exception) {
            System.out.println(exception.getMessage());
        }
    }

}
