package pl.michalek.marcin.piserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.michalek.marcin.piserver.audio.EspeakManager;
import pl.michalek.marcin.piserver.config.Constants;
import pl.michalek.marcin.piserver.network.dto.DailyForecastData;
import pl.michalek.marcin.piserver.network.dto.openweather.DailyForecast;
import pl.michalek.marcin.piserver.util.DateUtil;
import pl.michalek.marcin.piserver.util.WeatherUtil;

import java.util.Optional;

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

    @RequestMapping("/rain/say/when")
    @ResponseBody
    void sayWhenIstheFirstRainyDay() {
        Optional<DailyForecast> dailyForecast = WeatherUtil.getFitrstRainyDay(
                WeatherUtil.getDailyForecastForCityById(Constants.CITY_ID_KRAKOW).getForecasts());

        if (dailyForecast.isPresent()) {
            EspeakManager.synthesize("Rain on: " +
                    DateUtil.getSpeakableDateString(dailyForecast.get().getDate()));
        } else {
            EspeakManager.synthesize("No rain on this week.");
        }
    }

    @RequestMapping("/rain/say/when")
    @ResponseBody
    Long getFirstRainyDay() {
        Optional<DailyForecast> dailyForecast = WeatherUtil.getFitrstRainyDay(
                WeatherUtil.getDailyForecastForCityById(Constants.CITY_ID_KRAKOW).getForecasts());

        if (dailyForecast.isPresent()) {
            return dailyForecast.get().getDate();
        }

        return null;
    }
}