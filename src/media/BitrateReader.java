package media;

public class BitrateReader {

    public int getBitrateKbps(String targetFormat) {
        switch (targetFormat.toLowerCase()) {
            case "wav": return 1411;
            case "mp3": return 192;
            default:    return 12;
        }
    }
    public long estimateSizeKb(int durationSec, int bitrateKbps) {
        return (long) bitrateKbps * durationSec / 8;
    }
}