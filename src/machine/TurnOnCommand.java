package machine;

/**
 * Command to turn on a smart device.
 */
public class TurnOnCommand implements SmartDeviceCommand {
    private SmartDevice device;

    /**
     * Constructs a turn on command for a specific device.
     * @param device The device to turn on
     */
    public TurnOnCommand(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }

    @Override
    public void undo() {
        device.turnOff();
    }
}