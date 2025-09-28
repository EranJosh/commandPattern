package machine;

/**
 * Demonstration of the Smart Home Automation System.
 */
public class SmartHomeAutomationDemo {
    /**
     * Main method to showcase the smart home automation system.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create the Smart Home Hub
        SmartHomeHub hub = new SmartHomeHub();

        // Create smart devices
        SmartLight livingRoomLight = new SmartLight("Living Room");
        SmartThermostat homeThermo = new SmartThermostat("Home");
        SmartMusicPlayer bedroomSpeaker = new SmartMusicPlayer("Bedroom");

        // Register devices with the hub
        hub.registerDevice("living_room_light", livingRoomLight);
        hub.registerDevice("home_thermostat", homeThermo);
        hub.registerDevice("bedroom_speaker", bedroomSpeaker);

        // Demonstrate device control
        System.out.println("\n--- Turning On Devices ---");
        hub.executeCommand("living_room_light", new TurnOnCommand(livingRoomLight));
        hub.executeCommand("home_thermostat", new TurnOnCommand(homeThermo));
        hub.executeCommand("bedroom_speaker", new TurnOnCommand(bedroomSpeaker));

        // Perform device-specific actions
        System.out.println("\n--- Adjusting Device Settings ---");
        hub.executeCommand("living_room_light", new AdjustBrightnessCommand(livingRoomLight, 75));
        hub.executeCommand("home_thermostat", new AdjustTemperatureCommand(homeThermo, 24));
        hub.executeCommand("bedroom_speaker", new PlayPlaylistCommand(bedroomSpeaker, "Evening Chill"));

        // Demonstrate undo functionality
        System.out.println("\n--- Undoing Last Commands ---");
        hub.undoCommand("living_room_light", new AdjustBrightnessCommand(livingRoomLight, 75));
        hub.undoCommand("home_thermostat", new AdjustTemperatureCommand(homeThermo, 24));
        hub.undoCommand("bedroom_speaker", new PlayPlaylistCommand(bedroomSpeaker, "Evening Chill"));
    }
}