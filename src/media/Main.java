package media;

public class Main {

    public static void main(String[] args) {
        MediaConversionFacade converter = new MediaConversionFacade();
        System.out.println(converter.convert("podcast.wav", "mp3"));
    }
}