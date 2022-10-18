package Factory;

public class Pepperoni extends FazzBearPizza{
    @Override
    public void prepareIngredients() {
        System.out.println("Подготавливаем ингридиенты для пиццы Пепперони...");
    }

    @Override
    public void makePizza() {
        System.out.println("Делаем пиццу Пепперони...");
    }

    @Override
    public void givePizza() {
        System.out.println("Выносим пиццу Пепперони...");
    }
}
