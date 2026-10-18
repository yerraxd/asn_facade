package media;

public class BitrateReader {

    public int getBitrateKbps(String targetFormat) {
        return targetFormat.equalsIgnoreCase("wav") ? 1411 : 192;
    }
}