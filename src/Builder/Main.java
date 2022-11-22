package Builder;
//Паттерн Builder широко используется при решении задач с акцентом на поэлементное создание объекта из
//набора составных частей, заменяемых в зависимости от контекста.
public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new SportsCarBuilder();
        AutomotiveEngineer engineer = new AutomotiveEngineer(builder);
        Car car = engineer.manufactureCar();
        if (car != null) {
            System.out.println("Below car delievered: ");
            System.out.println("======================================================================");
            System.out.println(car);
            System.out.println("======================================================================");
        }
    }
}
