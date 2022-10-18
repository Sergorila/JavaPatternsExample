package Factory;

public class Program {
    public static void main(String[] args) {
        FazzBearPizzeria p = new FazzBearPizzeria(new PizzaFactory());
        p.orderPizza(PizzaType.Margarita);
        p.orderPizza(PizzaType.Donna);
        p.orderPizza(PizzaType.Pepperoni);
    }
}
