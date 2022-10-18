package Factory;

public class Margarita extends FazzBearPizza{
    @Override
    public void prepareIngredients() {
        System.out.println("Подготавливаем ингридиенты для пиццы Маргариты...");
    }

    @Override
    public void makePizza() {
        System.out.println("Делаем пиццу Маргариту...");
    }

    @Override
    public void givePizza() {
        System.out.println("Выносим пиццу Маргариту...");
    }
}
