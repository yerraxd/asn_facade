package media;

import facade.MediaConversionFacade;

public class Main {

    public static void main(String[] args) {
        MediaConversionFacade converter = new MediaConversionFacade();
        run(converter, "podcast.wav", "mp3");
        run(converter, "song.flac", "amr");
        run(converter, "track.mp3", "xyz");
        run(converter, "voice.txt", "mp3");
    }

    private static void run(MediaConversionFacade converter, String file, String format) {
        try {
            System.out.println("OK   " + converter.convert(file, format));
        } catch (UnsupportedFormatException e) {
            System.out.println("FAIL " + e.getMessage());
        }
    }
}