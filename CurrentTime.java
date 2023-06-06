package org.curie;

import java.time.LocalTime;

public class CurrentTime {
    String hour;
    String minute;

    public CurrentTime() {
        LocalTime l = LocalTime.now();
        String t = String.valueOf(l);
        hour = t.substring(0, 2);
        minute = t.substring(3, 5);
    }

    public String getTime() {
        int h = Integer.parseInt(hour);
        if (h > 12) {
            h = h % 12;
        }
        hour = String.valueOf(h);

        String minute_num;
        if (minute.charAt(0) == '0') {
            minute_num = minute.substring(1);
        }

        else {
            minute_num = minute;
        }

        return hour + " hour and " + minute + " minutes";
    }
}
