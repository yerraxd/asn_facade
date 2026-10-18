package media;

public class MetadataReader {

    public String readFormat(String fileName) {
        return fileName.substring(fileName.lastIndexOf('.') + 1).toLowerCase();
    }
}