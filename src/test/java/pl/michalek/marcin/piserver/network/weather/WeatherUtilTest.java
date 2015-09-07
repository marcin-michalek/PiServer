package pl.michalek.marcin.piserver.network.weather;

import org.junit.Test;
import pl.michalek.marcin.piserver.audio.EspeakManager;
import pl.michalek.marcin.piserver.config.Constants;
import pl.michalek.marcin.piserver.network.dto.DailyForecastData;
import pl.michalek.marcin.piserver.network.dto.openweather.DailyForecast;

import java.util.Optional;

import static junit.framework.TestCase.assertNotNull;

/**
 * PiServer
 * Created by Marcin on 2015-07-19.
 */
public class WeatherUtilTest {

    @Test
    public void testGetDailyForecastForCityById() throws Exception {
        DailyForecastData dailyForecastData = WeatherUtil.getDailyForecastForCityById(Constants.CITY_ID_KRAKOW);
        assertNotNull(dailyForecastData);
    }

    /**
     * Just to see how it works, without deploying on RPi.
     *
     * @throws Exception
     */
    @Test
    public void testGetFirstRainyDay() throws Exception {
        Optional<DailyForecast> dailyForecast = WeatherUtil.getFitrstRainyDay(
                WeatherUtil.getDailyForecastForCityById(Constants.CITY_ID_KRAKOW).getForecasts());

        if (dailyForecast.isPresent()) {
            EspeakManager.synthesize("Rain on:" + dailyForecast.get().getDateText());
        } else {
            EspeakManager.synthesize("No rain on this week");
        }
    }
}