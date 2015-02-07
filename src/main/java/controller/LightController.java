package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Marcin on 2015-02-06.
 */
@RestController
@RequestMapping(value = "/doors")
public class LightController {

    @RequestMapping("/a")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}