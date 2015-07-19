package pl.michalek.marcin.piserver.config;

/**
 * SvnMirror
 * Created by Marcin on 2015-07-18.
 */
public final class Constants {
    private Constants() {
    }

    // WEATHER API
    public static final long CITY_ID_KRAKOW = 3094802;
    public static final String WEATERH_API_ROOT = "http://api.openweathermap.org/data/2.5/forecast";
    public static final String WEATERH_FORECAST_CITY_BY_ID = WEATERH_API_ROOT + "?id=";

}
