package media;

public class AudioMixer {

    public int mixChannels(String targetFormat) {
        return targetFormat.equalsIgnoreCase("amr") ? 1 : 2; // amr is mono
    }
}