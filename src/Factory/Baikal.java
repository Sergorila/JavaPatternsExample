package Factory;

public class Baikal extends FazzBearDrink {
    @Override
    public void prepareIngredients() {
        System.out.println("Готовим напиток...");
    }

    @Override
    public void makeDrink() {
        System.out.println("Делаем Байкал...");
    }

    @Override
    public void giveDrink() {
        System.out.println("Байкал готов!");
    }
}
