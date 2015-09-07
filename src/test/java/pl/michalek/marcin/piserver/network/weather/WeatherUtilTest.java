package pl.michalek.marcin.piserver.network.weather;

import org.junit.Test;
import pl.michalek.marcin.piserver.config.Constants;
import pl.michalek.marcin.piserver.network.dto.DailyForecastData;

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
}