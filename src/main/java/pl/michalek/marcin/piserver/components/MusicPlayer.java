package pl.michalek.marcin.piserver.components;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * Taken from samples.
 */
public class MusicPlayer {
    public static void playFile(String path) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        AudioInputStream in = AudioSystem.getAudioInputStream(new File(path));
        AudioFormat baseFormat = in.getFormat();
        AudioFormat decodedFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED,
                baseFormat.getSampleRate(),
                16,
                baseFormat.getChannels(),
                baseFormat.getChannels() * 2,
                baseFormat.getSampleRate(),
                false);
        AudioInputStream din = AudioSystem.getAudioInputStream(decodedFormat, in);
        playRaw(decodedFormat, din);
        in.close();
    }

    private static void playRaw(AudioFormat targetFormat, AudioInputStream din) throws IOException, LineUnavailableException {
        byte[] data = new byte[4096];
        SourceDataLine line = getLine(targetFormat);
        if (line != null) {
            line.start();
            int nBytesRead = 0, nBytesWritten = 0;
            while (nBytesRead != -1) {
                nBytesRead = din.read(data, 0, data.length);
                if (nBytesRead != -1) nBytesWritten = line.write(data, 0, nBytesRead);
            }

            line.drain();
            line.stop();
            line.close();
            din.close();
        }
    }

    private static SourceDataLine getLine(AudioFormat audioFormat) throws LineUnavailableException {
        SourceDataLine res = (SourceDataLine) AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, audioFormat));
        res.open(audioFormat);
        return res;
    }
}
