package Builder;

//CarBuilder - тип возврата всех этапов.
//Это позволит вызывать этапы по цепочке.
//метод build() проверяет годность автомобиля и выпускает (возвращает) его только в том случае,
// если его сборка завершена успешно.
public interface CarBuilder {

    // Этап 1
    public CarBuilder fixChassis();

    // Этап 2
    public CarBuilder fixBody();

    // Этап 3
    public CarBuilder paint();

    // Этап 4

    public CarBuilder fixInterior();

    // Выпуск автомобиля

    public Car build();
}
