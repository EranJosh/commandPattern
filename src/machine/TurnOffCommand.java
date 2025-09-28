package machine;

/**
 * Command to turn off a smart device.
 */
public class TurnOffCommand implements SmartDeviceCommand {
    private SmartDevice device;

    /**
     * Constructs a turn off command for a specific device.
     * @param device The device to turn off
     */
    public TurnOffCommand(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }

    @Override
    public void undo() {
        device.turnOn();
    }
}