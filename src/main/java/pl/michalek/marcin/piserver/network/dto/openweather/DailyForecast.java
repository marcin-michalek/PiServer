package pl.michalek.marcin.piserver.network.dto.openweather;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 *
 */
public class DailyForecast {

    @JsonProperty("dt")
    private Long date;

    @JsonProperty("dt_txt")
    private String dateText;

    @JsonProperty("pressure")
    private Float pressure;

    @JsonProperty("humidity")
    private Integer humidity;

    @JsonProperty("speed")
    private Float windSpeed;

    @JsonProperty("deg")
    private Float windDegrees;

    @JsonProperty("clouds")
    private Clouds cloudCoverage;

    @JsonProperty("temp")
    private Temperature temperatureData;

    @JsonProperty("main")
    private Main main;

    @JsonProperty("weather")
    private Weather[] weatherData;

    @JsonProperty("wind")
    private Wind wind;

    @JsonProperty("rain")
    private Rain rain;

    @JsonProperty("sys")
    private System system;

    public Long getDate() {
        return date;
    }

    public void setDate(final Long date) {
        this.date = date;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(final Float pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(final Integer humidity) {
        this.humidity = humidity;
    }

    public Float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(final Float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Float getWindDegrees() {
        return windDegrees;
    }

    public void setWindDegrees(final Float windDegrees) {
        this.windDegrees = windDegrees;
    }

    public Clouds getCloudCoverage() {
        return cloudCoverage;
    }

    public void setCloudCoverage(final Clouds cloudCoverage) {
        this.cloudCoverage = cloudCoverage;
    }

    public Temperature getTemperatureData() {
        return temperatureData;
    }

    public void setTemperatureData(final Temperature temperatureData) {
        this.temperatureData = temperatureData;
    }

    public Weather[] getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(final Weather[] weatherData) {
        this.weatherData = weatherData;
    }

    public Date getDateAsDate() {
        return new Date(date * 1000);
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public String getDateText() {
        return dateText;
    }

    public void setDateText(String dateText) {
        this.dateText = dateText;
    }
}
