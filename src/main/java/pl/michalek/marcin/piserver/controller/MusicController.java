package pl.michalek.marcin.piserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.michalek.marcin.piserver.components.MusicPlayer;
import pl.michalek.marcin.piserver.response.BaseResponse;
import pl.michalek.marcin.piserver.response.SuccessResponse;

import javax.sound.sampled.*;
import java.io.IOException;

/**
 * Created by Marcin on 2015-02-06.
 */
@RestController
@RequestMapping(value = "/music")
public class MusicController {

    @RequestMapping("/play")
    BaseResponse playMusic() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        MusicPlayer.playFile("/home/pi/Desktop/sounds/test.wav");
        return new SuccessResponse("Audio finished");
    }
}