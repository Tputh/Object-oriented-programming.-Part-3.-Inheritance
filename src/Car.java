public final class Car extends Transport{
    private final String transmission;
    private final String bodyType;
    private final double engineVolume;
    public Car(String stamp, String model, int yearOfRelease, String countryOfManufacture, String bodyColor,
               int maximumMovementSpeed, String transmission, String bodyType, double engineVolume) {
        super(stamp, model, yearOfRelease, countryOfManufacture, bodyColor, maximumMovementSpeed);
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return "Марка " + getStamp() + "; " + "Модель " + getModel() + "; " + "Год выпуска " + getYearOfRelease() + "; " +
                "Страна производства " + getCountryOfManufacture() + "; " + "Цвет кузова " + getBodyColor() + "; " +
                "Максимальная скорость передвижения " + getMaximumMovementSpeed()+ "км/час" + ";" + "Коробка передач " +
                transmission + "; " + "Тип кузова " + bodyType + "; " +
                "Объём двигателя " + engineVolume;
    }

    @Override
    public String toString(Transport transport) {
        return null;
    }
}
