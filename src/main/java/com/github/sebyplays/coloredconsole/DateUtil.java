package com.github.sebyplays.coloredconsole;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * It gets the current date and time and returns it as a string
 */
public class DateUtil {

    /**
     * This function gets the current date and returns it as a string
     *
     * @return The current date in the format of MM/dd/yyyy
     */
    public String getDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String currentDate = simpleDateFormat.format(date) + " | ";
        return currentDate;
    }

    /**
     * It returns a string of the current time in the format of HH:mm:ss
     *
     * @return The current time in the format of HH:mm:ss
     */
    public String getTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String currentTime = simpleDateFormat.format(date) + " | ";
        return currentTime;
    }

}
