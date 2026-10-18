package media;

public class BitrateReader {

    public int getBitrateKbps(String targetFormat) {
        int bitrate = targetFormat.equalsIgnoreCase("wav") ? 1411 : 192;
        System.out.println("Bitrate: " + bitrate);
        return bitrate;
    }
}