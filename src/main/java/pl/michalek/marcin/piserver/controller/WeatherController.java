package pl.michalek.marcin.piserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.michalek.marcin.piserver.config.Constants;
import pl.michalek.marcin.piserver.network.dto.DailyForecastData;
import pl.michalek.marcin.piserver.network.weather.WeatherUtil;

/**
 * Created by Marcin on 2015-02-06.
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {

    @RequestMapping("/present")
    @ResponseBody
    DailyForecastData presentWeatherInformation() {
        return WeatherUtil.getDailyForecastForCityById(Constants.CITY_ID_KRAKOW);
    }
}