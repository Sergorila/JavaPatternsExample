package Factory;

public class PizzaFactory {
    public FazzBearPizza createCoffee (PizzaType type) {
        FazzBearPizza pizza = null;

        switch (type) {
            case Margarita:
                pizza = new Margarita();
                break;
            case Donna:
                pizza = new Donna();
                break;
            case Pepperoni:
                pizza = new Pepperoni();
                break;
        }

        return pizza;
    }
}
