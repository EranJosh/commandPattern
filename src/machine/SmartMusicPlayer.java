package machine;

/**
 * Represents a smart music player device with volume and playlist control.
 */
public class SmartMusicPlayer extends SmartDevice {
    private int volume;
    // Package-private to allow access from command classes
    String currentPlaylist;

    /**
     * Constructs a smart music player with a given name.
     * @param name The name of the music player
     */
    public SmartMusicPlayer(String name) {
        super(name);
        this.volume = 0;
        this.currentPlaylist = "";
    }

    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            volume = 50; // Default volume
            System.out.println(name + " music player turned on");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            volume = 0;
            currentPlaylist = "";
            System.out.println(name + " music player turned off");
        }
    }

    /**
     * Adjusts the volume of the music player.
     * @param vol Volume level (0-100)
     */
    public void adjustVolume(int vol) {
        if (isOn) {
            volume = Math.max(0, Math.min(100, vol));
            System.out.println(name + " volume set to " + volume + "%");
        }
    }

    /**
     * Plays a specific playlist.
     * @param playlist Name of the playlist to play
     */
    public void playPlaylist(String playlist) {
        if (isOn) {
            currentPlaylist = playlist;
            System.out.println(name + " now playing playlist: " + playlist);
        }
    }
}