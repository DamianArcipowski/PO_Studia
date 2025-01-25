public class VideoPlayer implements MediaPlayer {

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
        return "Current video is:" ;
    }
}
