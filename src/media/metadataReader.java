package media;

public class metadataReader {

    public String readFormat(String fileName) {
        return fileName.substring(fileName.lastIndexOf('.') + 1).toLowerCase();
    }
}