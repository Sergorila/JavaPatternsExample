package Factory;

public class DrinkFactory {
    public FazzBearDrink createDrink (PizzaType type) {
        FazzBearDrink drink = null;

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
