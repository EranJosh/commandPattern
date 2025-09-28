package machine;

import java.util.HashMap;
import java.util.Map;

/**
 * Central hub for managing and controlling smart home devices.
 */
public class SmartHomeHub {
    // Map to store devices by their unique identifier
    private Map<String, SmartDevice> devices = new HashMap<>();

    /**
     * Registers a new device with the hub.
     * @param id Unique identifier for the device
     * @param device The device to register
     */
    public void registerDevice(String id, SmartDevice device) {
        devices.put(id, device);
    }

    /**
     * Executes a command on a specific device.
     * @param deviceId The unique identifier of the device
     * @param command The command to execute
     */
    public void executeCommand(String deviceId, SmartDeviceCommand command) {
        SmartDevice device = devices.get(deviceId);
        if (device != null) {
            command.execute();
        } else {
            System.out.println("Device not found: " + deviceId);
        }
    }

    /**
     * Undoes the last command on a specific device.
     * @param deviceId The unique identifier of the device
     * @param command The command to undo
     */
    public void undoCommand(String deviceId, SmartDeviceCommand command) {
        SmartDevice device = devices.get(deviceId);
        if (device != null) {
            command.undo();
        } else {
            System.out.println("Device not found: " + deviceId);
        }
    }
}