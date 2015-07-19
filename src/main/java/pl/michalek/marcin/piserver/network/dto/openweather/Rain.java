/*
* Rain.java
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

/**
 * Rain data as returned by the API.
 *
 * @author Nicolaas Frederick Huysamen
 * @version 2.5
 */
public class Rain {

    @JsonProperty("1h")
    private Float precipitationPerHour;

    @JsonProperty("3h")
    private Float precipitationPerThreeHours;

    public Float getPrecipitationPerHour() {
        return precipitationPerHour;
    }

    public void setPrecipitationPerHour(final Float precipitationPerHour) {
        this.precipitationPerHour = precipitationPerHour;
    }

    public Float getPrecipitationPerThreeHours() {
        return precipitationPerThreeHours;
    }

    public void setPrecipitationPerThreeHours(final Float precipitationPerThreeHours) {
        this.precipitationPerThreeHours = precipitationPerThreeHours;
    }
}
