package pl.michalek.marcin.piserver.network.weather;

import pl.michalek.marcin.piserver.config.Constants;
import pl.michalek.marcin.piserver.network.BaseRestTemplate;
import pl.michalek.marcin.piserver.network.dto.DailyForecastData;
import pl.michalek.marcin.piserver.network.dto.openweather.DailyForecast;

import java.util.List;
import java.util.Optional;

/**
 * PiServer
 * Created by Marcin on 2015-07-18.
 */
public class WeatherUtil extends BaseRestTemplate {
    public static DailyForecastData getDailyForecastForCityById(long cityId) {
        return restTemplate.getForObject(
                Constants.WEATERH_FORECAST_CITY_BY_ID + cityId,
                DailyForecastData.class
        );
    }

    public static Optional<DailyForecast> getFitrstRainyDay(List<DailyForecast> dailyForecasts){
        return dailyForecasts.stream()
                .filter(forecast -> forecast.getRain() != null)
                .findFirst();
    }
}
