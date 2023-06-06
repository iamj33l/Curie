package org.curie;

import java.time.LocalDate;

public class CurrentDate {
    String day;
    String month;

    public CurrentDate() {
        LocalDate l = LocalDate.now();
        String d = String.valueOf(l);
        month = d.substring(5, 7);
        day = d.substring(8, 10);
    }

    public String getDate() {
        switch (month) {
            case "01":
                month = "January";
                break;
            case "02":
                month = "February";
                break;
            case "03":
                month = "March";
                break;
            case "04":
                month = "April";
                break;
            case "05":
                month = "May";
                break;
            case "06":
                month = "June";
                break;
            case "07":
                month = "July";
                break;
            case "08":
                month = "August";
                break;
            case "09":
                month = "September";
                break;
            case "10":
                month = "October";
                break;
            case "11":
                month = "November";
                break;
            case "12":
                month = "December";
                break;
        }

        String day_num;
        if (day.charAt(0) == '0') {
            day_num = day.substring(1);
        }

        else {
            day_num = day;
        }
        return month + ", " + day_num;
    }
}