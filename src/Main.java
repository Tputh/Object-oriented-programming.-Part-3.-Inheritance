public class Main {
    public static void main(String[] args) {
        System.out.println("Дз. Объектно-ориентированное программирование. Часть 3. Наследование");
        Bus bus = new Bus("Mercedes-Benz", "Travego M OM 457 LA", 2020,
                "Германия", "Белый", 200,56,
                12.82,3.7);
        System.out.println(bus);
        Car car = new Car("Dodge", "Challenger SRT Demon", 2015,
                "Америка", "Белый", 335, "механическая",
                "купе", 6.2);
        System.out.println(car);
    }
}