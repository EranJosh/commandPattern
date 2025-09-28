package machine;

/**
 * Command to adjust the brightness of a smart light.
 */
public class AdjustBrightnessCommand implements SmartDeviceCommand {
    private SmartLight light;
    private int brightness;
    private int previousBrightness;

    /**
     * Constructs a brightness adjustment command.
     * @param light The smart light to adjust
     * @param brightness The target brightness level
     */
    public AdjustBrightnessCommand(SmartLight light, int brightness) {
        this.light = light;
        this.brightness = brightness;
        this.previousBrightness = 0; // Will be set in execute
    }

    @Override
    public void execute() {
        if (light != null) {
            previousBrightness = light.brightness;
            light.adjustBrightness(brightness);
        }
    }

    @Override
    public void undo() {
        if (light != null) {
            light.adjustBrightness(previousBrightness);
        }
    }
}