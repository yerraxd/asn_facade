package media;

public class CodecFactory {

    public String getCodec(String targetFormat) {
        switch (targetFormat.toLowerCase()) {
            case "mp3": return "LAME MP3";
            case "wav": return "PCM";
            default:
                throw new UnsupportedFormatException("Unsupported target format: " + targetFormat);
        }
    }
}