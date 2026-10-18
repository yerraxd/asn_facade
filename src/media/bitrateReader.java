package media;

public class bitrateReader {

    public int getBitrateKbps(String targetFormat) {
        int bitrate = targetFormat.equalsIgnoreCase("wav") ? 1411 : 192;
        System.out.println("Bitrate: " + bitrate);
        return bitrate;
    }
}