package Factory;

public class Cola extends FazzBearDrink {
    @Override
    public void prepareIngredients() {
        System.out.println("Готовим напиток...");
    }

    @Override
    public void makeDrink() {
        System.out.println("Делаем колу...");
    }

    @Override
    public void giveDrink() {
        System.out.println("Кола готов!");
    }
}
