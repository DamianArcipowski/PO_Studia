public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String trackName) {
        System.out.println("Playing " + trackName);
    }

    @Override
    public void pause() {
        System.out.println("Paused");
    }

    @Override
    public String getCurrentTrack() {
        return "Current track is:" ;
    }
}
