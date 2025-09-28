package machine;

/**
 * Interface defining standard command methods for smart home devices.
 */
public interface SmartDeviceCommand {
    /**
     * Executes the command on a device.
     */
    void execute();

    /**
     * Undoes the last executed command.
     */
    void undo();
}