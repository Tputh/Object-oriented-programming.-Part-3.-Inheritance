import java.util.Objects;

public abstract class Transport {
    private String stamp;
    private String model;
    private int yearOfRelease;
    private String countryOfManufacture;
    private String bodyColor;
    private int maximumMovementSpeed;

    public String getStamp() {
        return stamp;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public final String getBodyColor() {
        return bodyColor;
    }
    public final void setBodyColor(String bodyColor) {
        if (bodyColor != null && bodyColor.isBlank()) {
            this.bodyColor = bodyColor;
        } else {
            bodyColor = "default";
        }
    }

    public final int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }
    public final void setMaximumMovementSpeed(int maximumMovementSpeed) {
        if (maximumMovementSpeed != 0) {
            this.maximumMovementSpeed = maximumMovementSpeed;
        } else {
            maximumMovementSpeed = 100;
        }
    }

    // Конструктор
    public Transport(String stamp, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed) {
        this.stamp = stamp;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.countryOfManufacture = countryOfManufacture;
        this.bodyColor = bodyColor;
        this.maximumMovementSpeed = maximumMovementSpeed;
    }


    public abstract String toString(Transport transport);
}
