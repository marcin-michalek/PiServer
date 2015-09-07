/*
* WeatherData.java
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
import pl.michalek.marcin.piserver.network.dto.openweather.*;
import pl.michalek.marcin.piserver.network.dto.openweather.System;

import java.util.Date;

/**
 * Weather data as returned by the API.
 *
 * @author Nicolaas Frederick Huysamen
 * @version 2.5
 */
public class WeatherData {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("dt")
    private Long date;

    @JsonProperty("base")
    private String base;

    @JsonProperty("cod")
    private Integer cod;

    @JsonProperty("coord")
    private Coordinates coordinates;

    @JsonProperty("sys")
    private System systemData;

    @JsonProperty("main")
    private Main mainData;

    @JsonProperty("weather")
    private Weather[] weatherData;

    @JsonProperty("clouds")
    private Clouds cloudData;

    @JsonProperty("wind")
    private Wind windData;

    @JsonProperty("rain")
    private Rain rainData;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(final Long date) {
        this.date = date;
    }

    public String getBase() {
        return base;
    }

    public void setBase(final String base) {
        this.base = base;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(final Integer cod) {
        this.cod = cod;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(final Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public System getSystemData() {
        return systemData;
    }

    public void setSystemData(final System systemData) {
        this.systemData = systemData;
    }

    public Main getMainData() {
        return mainData;
    }

    public void setMainData(final Main mainData) {
        this.mainData = mainData;
    }

    public Weather[] getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(final Weather[] weatherData) {
        this.weatherData = weatherData;
    }

    public Clouds getCloudData() {
        return cloudData;
    }

    public void setCloudData(final Clouds cloudData) {
        this.cloudData = cloudData;
    }

    public Wind getWindData() {
        return windData;
    }

    public void setWindData(final Wind windData) {
        this.windData = windData;
    }

    public Rain getRainData() {
        return rainData;
    }

    public void setRainData(final Rain rainData) {
        this.rainData = rainData;
    }

    public Date getDateAsDate() {
        return new Date(date * 1000);
    }
}
