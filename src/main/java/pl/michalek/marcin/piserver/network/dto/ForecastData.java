/*
* ForecastData.java
*
* Copyright (c) 2013, Nicolaas Frederick Huysamen. All rights reserved.
*
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation; either
* version 3 of the License, or (at your option) any later version.
*
* This library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this library; if not, write to the Free Software
* Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
* MA 02110-1301 USA
*/

package pl.michalek.marcin.piserver.network.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import pl.michalek.marcin.piserver.network.dto.openweather.City;
import pl.michalek.marcin.piserver.network.dto.openweather.Forecast;

/**
 * Forecast data as returned by the API.
 *
 * @author Nicolaas Frederick Huysamen
 * @version 2.5
 */
public class ForecastData {

    @JsonProperty("cod")
    private Integer cod;

    @JsonProperty("message")
    private Float message;

    @JsonProperty("cnt")
    private Integer numberOfForecasts;

    @JsonProperty("city")
    private City city;

    @JsonProperty("list")
    private Forecast[] forecasts;

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

    public Forecast[] getForecasts() {
        return forecasts;
    }

    public void setForecasts(final Forecast[] forecasts) {
        this.forecasts = forecasts;
    }
}
