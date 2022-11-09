package Factory;

public class FazzBearPizzeria {
    private final PizzaFactory pizzaFactory;
    public FazzBearPizzeria(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public FazzBearPizza orderPizza(PizzaType type) {
        FazzBearPizza pizza = pizzaFactory.createPizza(type);
        pizza.prepareIngredients();
        pizza.makePizza();
        pizza.givePizza();

        System.out.println("Пицца готова!");
        return pizza;
    }
}
