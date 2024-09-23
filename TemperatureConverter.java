class TemperatureBelowAbsoluteZeroException extends Exception {
    private double temperature;
    private String scale;
    public TemperatureBelowAbsoluteZeroException(double temperature, String scale) {
        super("Error: " + temperature + "°" + scale + " is below absolute zero. Temperature is below absolute zero!");
        this.temperature = temperature;
        this.scale = scale;
    }
    public double getTemperature() {
        return temperature;
    }
    public String getScale() {
        return scale;
    }
}
public class TemperatureConverter {
    private static final double ABSOLUTE_ZERO_C = -273.15;
    private static final double ABSOLUTE_ZERO_F = -459.67;
    public static double fahrenheitToCelsius(double fahrenheit) throws TemperatureBelowAbsoluteZeroException {
        if (fahrenheit < ABSOLUTE_ZERO_F) {
            throw new TemperatureBelowAbsoluteZeroException(fahrenheit, "F");
        }
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double celsiusToFahrenheit(double celsius) throws TemperatureBelowAbsoluteZeroException {
        if (celsius < ABSOLUTE_ZERO_C) {
            throw new TemperatureBelowAbsoluteZeroException(celsius, "C");
        }
        return (celsius * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        try {
            double fahrenheit = -500;
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%.2f°F is %.2f°C%n", fahrenheit, celsius);

        } catch (TemperatureBelowAbsoluteZeroException e) {
            System.out.println(e.getMessage());
        }
        try {
            double celsius = -300;
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%.2f°C is %.2f°F%n", celsius, fahrenheit);
        } catch (TemperatureBelowAbsoluteZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
