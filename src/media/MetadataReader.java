package media;

import java.util.List;

public class MetadataReader {

    private static final List<String> SOURCES = List.of("wav", "mp3", "flac");

    public String readFormat(String fileName) {
        int dot = fileName.lastIndexOf('.');
        String format = dot < 0 ? "" : fileName.substring(dot + 1).toLowerCase();
        if (!SOURCES.contains(format)) {
            throw new UnsupportedFormatException("Unsupported source file: " + fileName);
        }
        return format;
    }
}