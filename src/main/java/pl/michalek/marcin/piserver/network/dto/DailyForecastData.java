package pl.michalek.marcin.piserver.network.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import pl.michalek.marcin.piserver.network.dto.openweather.City;
import pl.michalek.marcin.piserver.network.dto.openweather.DailyForecast;

/**
 *
 */
public class DailyForecastData {

    @JsonProperty("cod")
    private Integer cod;

    @JsonProperty("message")
    private Float message;

    @JsonProperty("cnt")
    private Integer numberOfForecasts;

    @JsonProperty("city")
    private City city;

    @JsonProperty("list")
    private DailyForecast[] forecasts;

    public Integer getCod() {
        return cod;
    }

    public void setCod(final Integer cod) {
        this.cod = cod;
    }

    public Float getMessage() {
        return message;
    }

    public void setMessage(final Float message) {
        this.message = message;
    }

    public Integer getNumberOfForecasts() {
        return numberOfForecasts;
    }

    public void setNumberOfForecasts(final Integer numberOfForecasts) {
        this.numberOfForecasts = numberOfForecasts;
    }

    public City getCity() {
        return city;
    }

    public void setCity(final City city) {
        this.city = city;
    }

    public DailyForecast[] getForecasts() {
        return forecasts;
    }

    public void setForecasts(final DailyForecast[] forecasts) {
        this.forecasts = forecasts;
    }
}
