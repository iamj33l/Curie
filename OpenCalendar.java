package org.curie;

public class OpenCalendar {
    public void createEvent(String event) {
        String eventName = event.substring(13, event.length() - 1);
        String eventName2 = eventName.replace(" ", "+");
        try {
            Runtime.getRuntime().exec("cmd /c start chrome https://calendar.google.com/calendar/r/eventedit?text=" + eventName2 + "&dates=20210501T000000Z/20210501T000000Z&details=Event+Description&location=Event+Location&sf=true&output=xml");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
