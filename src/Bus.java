public final class Bus extends Transport {
    private final int passengerCompartmentCapacity;
    private final double length;
    private final double height;


    public Bus(String stamp, String model, int yearOfRelease, String countryOfManufacture, String bodyColor,
               int maximumMovementSpeed,  int passengerCompartmentCapacity, double length, double height) {
        super(stamp, model, yearOfRelease, countryOfManufacture, bodyColor, maximumMovementSpeed);
        this.passengerCompartmentCapacity = passengerCompartmentCapacity;
        this.length = length;
        this.height = height;
    }

    public int getPassengerCompartmentCapacity() {
        return passengerCompartmentCapacity;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Марка " + getStamp() + "; " + "Модель " + getModel() + "; " + "Год выпуска " + getYearOfRelease() + "; " +
                "Страна производства " + getCountryOfManufacture() + "; " + "Цвет кузова " + getBodyColor() + "; " +
                "Максимальная скорость передвижения " + getMaximumMovementSpeed()+ "км/час" + ";" +
        "Вместимость салона " + passengerCompartmentCapacity + "; " + "Длина " + length + "m" + "; " +
                "Высота " + height + "m";
    }


    @Override
    public String toString(Transport transport) {
        return null;
    }
}
