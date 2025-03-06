package simplefactory;

public class PizzaFactory {

    public Pizza createPizza(String pizzaType) throws InvalidInputException{
        if(pizzaType.equals("cheese")) {
          return  new CheesePizza();
        }else if(pizzaType.equals("veg")) {
            return  new VeggiePizza();
        }else{
            throw new InvalidInputException("incorrect input passed : "+ pizzaType);
        }
    }
}
