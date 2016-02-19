package BerlinClock.at;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by PC on 18.02.2016.
 */
public class Transfomator {
    public String transformHours(String standardTime) throws ParseException {
        String hours1 = "OOOO";
        String hours2 = "OOOO";
        Date date = new SimpleDateFormat("HH:mm:ss").parse(standardTime);
        Integer hours = Integer.parseInt(new SimpleDateFormat("HH").format(date));
        if (standardTime.equals("24:00:00"))
            hours = Integer.parseInt(new SimpleDateFormat("kk").format(date));
        for (int i = 0; i <= Math.abs(hours/5); i++){
            if (i > 0)
                hours1 = hours1.replaceFirst("O", "R");
        }
        for (int i = 0; i <= hours % 5; i++){
            if (i > 0)
                hours2 = hours2.replaceFirst("O", "R");
        }
        return hours1 + " " + hours2;
    }

    public String transformMinutes(Date date) throws ParseException {
        String minutes1 = "OOOOOOOOOOO";
        String minutes2 = "OOOO";
        Integer minutes = Integer.parseInt(new SimpleDateFormat("mm").format(date));
        for (int i = 0; i <= Math.abs(minutes/5); i++){
            if (i > 0)
                minutes1 = minutes1.replaceFirst("O", "Y");
            if ((i % 3 == 0) && (i > 0)) {
                int index = minutes1.lastIndexOf("Y");
                minutes1 = minutes1.substring(0, index) + "R" + minutes1.substring(index + 1, minutes1.length());
            }
        }
        for (int i = 0; i <= minutes % 5; i++){
            if (i > 0)
                minutes2 = minutes2.replaceFirst("O", "Y");
        }
        return minutes1 + " " + minutes2;
    }

    public String transformSeconds(Date date) throws ParseException {
        if (Integer.parseInt(new SimpleDateFormat("ss").format(date)) % 2 == 1)
            return "O";
        else
            return "Y";
    }
}
