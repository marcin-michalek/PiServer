/*
* System.java
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

package pl.michalek.marcin.piserver.network.dto.openweather;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * System data as returned by the API.
 *
 * @author Nicolaas Frederick Huysamen
 * @version 2.5
 */
public class System {

    @JsonProperty("message")
    private String message;

    @JsonProperty("country")
    private String country;

    @JsonProperty("sunrise")
    private Long sunrise;

    @JsonProperty("sunset")
    private Long sunset;

    @JsonProperty("pod")
    private String pod;

    @JsonProperty("population")
    private Long population;

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public Long getSunrise() {
        return sunrise;
    }

    public void setSunrise(final Long sunrise) {
        this.sunrise = sunrise;
    }

    public Long getSunset() {
        return sunset;
    }

    public void setSunset(final Long sunset) {
        this.sunset = sunset;
    }

    public Date getSunriseAsDate() {
        return new Date(sunrise * 1000);
    }

    public Date getSunsetAsDate() {
        return new Date(sunset * 1000);
    }

    public String getPod() {
        return pod;
    }

    public void setPod(final String pod) {
        this.pod = pod;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }
}
