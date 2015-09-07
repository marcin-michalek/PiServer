package pl.michalek.marcin.piserver.network.dto.openweather;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 */
public class Temperature {

    @JsonProperty("min")
    private Float minimum;

    @JsonProperty("max")
    private Float maximum;

    @JsonProperty("morn")
    private Float morning;

    @JsonProperty("day")
    private Float day;

    @JsonProperty("eve")
    private Float evening;

    @JsonProperty("night")
    private Float night;

    public Float getMinimum() {
        return minimum;
    }

    public void setMinimum(final Float minimum) {
        this.minimum = minimum;
    }

    public Float getMaximum() {
        return maximum;
    }

    public void setMaximum(final Float maximum) {
        this.maximum = maximum;
    }

    public Float getMorning() {
        return morning;
    }

    public void setMorning(final Float morning) {
        this.morning = morning;
    }

    public Float getDay() {
        return day;
    }

    public void setDay(final Float day) {
        this.day = day;
    }

    public Float getEvening() {
        return evening;
    }

    public void setEvening(final Float evening) {
        this.evening = evening;
    }

    public Float getNight() {
        return night;
    }

    public void setNight(final Float night) {
        this.night = night;
    }
}
