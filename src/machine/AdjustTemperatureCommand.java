package machine;

/**
 * Command to adjust the temperature of a smart thermostat.
 */
public class AdjustTemperatureCommand implements SmartDeviceCommand {
    private SmartThermostat thermostat;
    private int temperature;
    private int previousTemperature;

    /**
     * Constructs a temperature adjustment command.
     * @param thermostat The smart thermostat to adjust
     * @param temperature The target temperature
     */
    public AdjustTemperatureCommand(SmartThermostat thermostat, int temperature) {
        this.thermostat = thermostat;
        this.temperature = temperature;
        this.previousTemperature = 0; // Will be set in execute
    }

    @Override
    public void execute() {
        if (thermostat != null) {
            previousTemperature = thermostat.temperature;
            thermostat.adjustTemperature(temperature);
        }
    }

    @Override
    public void undo() {
        if (thermostat != null) {
            thermostat.adjustTemperature(previousTemperature);
        }
    }
}