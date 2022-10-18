package Factory;

public class Donna extends FazzBearPizza{
    @Override
    public void prepareIngredients() {
        System.out.println("Подготавливаем ингридиенты для пиццы Донна...");
    }

    @Override
    public void makePizza() {
        System.out.println("Делаем пиццу Донна...");
    }

    @Override
    public void givePizza() {
        System.out.println("Выносим пиццу Донна...");
    }
}
