package pl.michalek.marcin.piserver.controller;

import com.pi4j.io.gpio.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.michalek.marcin.piserver.response.BaseResponse;
import pl.michalek.marcin.piserver.response.SuccessResponse;

/**
 * Created by Marcin on 2015-02-06.
 */
@RestController
@RequestMapping(value = "/light")
public class LightController {
    final private GpioController gpioController = GpioFactory.getInstance();
    private GpioPinDigitalOutput relay = gpioController.provisionDigitalOutputPin(
            RaspiPin.GPIO_04,
            "Relay",
            PinState.LOW);

    @RequestMapping("/on")
    @ResponseBody
    BaseResponse lightOn() {
        relay.high();
        return new SuccessResponse("Lights on.");
    }

    @RequestMapping("/off")
    @ResponseBody
    BaseResponse lightOff() {
        relay.low();
        return new SuccessResponse("Lights off.");
    }
}