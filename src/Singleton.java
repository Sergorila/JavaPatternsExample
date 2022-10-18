public class Singleton {
    private static Singleton _instance=null; // ссылка на экземпляр класса Singleton
    private int a; // внутренние данные

    // Защищенный конструктор класса
    protected Singleton() {
        a = 0;
    }

    // Метод, возвращающий клиенту единственный экземпляр класса Singleton
    public static Singleton Instance() {
        if (_instance == null) {
            _instance = new Singleton(); // создать экземпляр класса Singleton
            return _instance;
        } else
            return null;
    }

    // Методы доступа к данным класса
    public void Set(int _a) {
        a = _a;
    }

    public int Get() { return a; }

    // Метод вывода внутренних данных для контроля
    public void Print() {
        System.out.println("A.a = " + a);
    }
}
