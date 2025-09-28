package machine;

/**
 * Represents a smart thermostat device with temperature control.
 */
public class SmartThermostat extends SmartDevice {
    // Package-private to allow access from command classes
    int temperature;

    /**
     * Constructs a smart thermostat with a given name.
     * @param name The name of the thermostat
     */
    public SmartThermostat(String name) {
        super(name);
        this.temperature = 20; // Default temperature
    }

    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            temperature = 22; // Default when turned on
            System.out.println(name + " thermostat activated at " + temperature + "°C");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            temperature = 0;
            System.out.println(name + " thermostat deactivated");
        }
    }

    /**
     * Adjusts the temperature of the thermostat.
     * @param temp Target temperature
     */
    public void adjustTemperature(int temp) {
        if (isOn) {
            temperature = Math.max(16, Math.min(30, temp));
            System.out.println(name + " temperature set to " + temperature + "°C");
        }
    }
}