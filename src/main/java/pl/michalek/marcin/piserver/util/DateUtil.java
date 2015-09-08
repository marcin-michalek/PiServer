package pl.michalek.marcin.piserver.util;

import org.joda.time.DateTime;

/**
 * Created by marcinm on 9/8/15.
 */
public class DateUtil {
    public static String getSpeakableDateString(long timestamp){
        DateTime dateTime = new DateTime(timestamp);
        return dateTime.dayOfWeek().getAsText() + " " +
                dateTime.getDayOfMonth() + " of " +
                dateTime.monthOfYear().getAsText() + " at about " +
                dateTime.getHourOfDay() + " " + dateTime.getMinuteOfHour();
    }
}
