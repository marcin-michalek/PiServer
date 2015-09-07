package pl.michalek.marcin.piserver.audio;

import java.io.IOException;

/**
 * PiServer
 * Created by Marcin on 2015-06-30.
 */
public class EspeakManager {
    public static void synthesize(String message) {
        try {
            Runtime.getRuntime().exec("espeak \"" + message + "\"");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
