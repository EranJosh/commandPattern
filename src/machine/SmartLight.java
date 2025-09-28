package machine;

/**
 * Represents a smart light device with brightness control.
 */
public class SmartLight extends SmartDevice {
    // Package-private to allow access from command classes
    int brightness;

    /**
     * Constructs a smart light with a given name.
     * @param name The name of the light
     */
    public SmartLight(String name) {
        super(name);
        this.brightness = 0;
    }

    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            brightness = 50; // Default brightness
            System.out.println(name + " light turned on at " + brightness + "% brightness");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            brightness = 0;
            System.out.println(name + " light turned off");
        }
    }

    /**
     * Adjusts the brightness of the light.
     * @param level Brightness level (0-100)
     */
    public void adjustBrightness(int level) {
        if (isOn) {
            brightness = Math.max(0, Math.min(100, level));
            System.out.println(name + " brightness set to " + brightness + "%");
        }
    }
}