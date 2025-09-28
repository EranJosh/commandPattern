package machine;

/**
 * Command to play a playlist on a smart music player.
 */
public class PlayPlaylistCommand implements SmartDeviceCommand {
    private SmartMusicPlayer musicPlayer;
    private String playlist;
    private String previousPlaylist;

    /**
     * Constructs a play playlist command.
     * @param musicPlayer The smart music player
     * @param playlist The playlist to play
     */
    public PlayPlaylistCommand(SmartMusicPlayer musicPlayer, String playlist) {
        this.musicPlayer = musicPlayer;
        this.playlist = playlist;
        this.previousPlaylist = "";
    }

    @Override
    public void execute() {
        if (musicPlayer != null) {
            previousPlaylist = musicPlayer.currentPlaylist;
            musicPlayer.playPlaylist(playlist);
        }
    }

    @Override
    public void undo() {
        if (musicPlayer != null) {
            musicPlayer.playPlaylist(previousPlaylist);
        }
    }
}