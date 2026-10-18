package facade;

import media.AudioMixer;
import media.BitrateReader;
import media.CodecFactory;
import media.MetadataReader;

public class MediaConversionFacade {

    private final MetadataReader metadataReader = new MetadataReader();
    private final CodecFactory codecFactory = new CodecFactory();
    private final BitrateReader bitrateReader = new BitrateReader();
    private final AudioMixer audioMixer = new AudioMixer();

    public String convert(String fileName, String targetFormat) {
        metadataReader.readFormat(fileName);
        int duration = metadataReader.readDurationSec(fileName);
        String codec = codecFactory.getCodec(targetFormat);
        int bitrate = bitrateReader.getBitrateKbps(targetFormat);
        int channels = audioMixer.mixChannels(targetFormat);
        long sizeKb = bitrateReader.estimateSizeKb(duration, bitrate);

        String outputName = fileName.substring(0, fileName.lastIndexOf('.')) + "." + targetFormat;
        return outputName + " [" + codec + ", " + bitrate + " kbps, "
                + channels + " ch, ~" + sizeKb + " KB]";
    }
}