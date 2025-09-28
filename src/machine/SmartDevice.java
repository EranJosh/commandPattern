package machine;

/**
 * Abstract base class for all smart home devices.
 */
public abstract class SmartDevice {
    protected String name;
    protected boolean isOn = false;

    /**
     * Constructs a smart device with a given name.
     * @param name The name of the device
     */
    public SmartDevice(String name) {
        this.name = name;
    }

    /**
     * Turns on the device.
     */
    public abstract void turnOn();

    /**
     * Turns off the device.
     */
    public abstract void turnOff();
}