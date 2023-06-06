package org.curie;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;

public class Curie {
    String curie(String s) throws ExecutionException, InterruptedException, IOException, URISyntaxException {
        JVoice v = new JVoice();
        String text = null;

        if ((s.contains("Hey") || s.contains("Hello"))) {
            text = "Hello, How can I help you?";
            v.speak(text);
        }

        else if (s.contains("How are you") || s.contains("how are you")) {
            text = "I am fine, Thank you.";
            v.speak(text);
        }

        else if (s.contains("What is your name") || s.contains("what is your name")) {
            text = "My name is Curie.";
            v.speak(text);
        }

        else if (s.contains("What is your age") || s.contains("what is your age") || s.contains("How old are you") || s.contains("how old are you")) {
            text = "I am 3 month old.";
            v.speak(text);
        }

        else if ((s.contains("today") || s.contains("current")) && s.contains("date")) {
            CurrentDate d = new CurrentDate();
            String date = d.getDate();

            text = "Today's date is " + date;
            v.speak(text);
        }

        else if ((s.contains("Introduce") || s.contains("introduce")) && s.contains("yourself")) {
            text = "hey, My name is Curie, the voice assistant written in java. I was created by Abhay Gayakwad, Niraj Parmar and Jeel Patel.";
            v.speak(text);
        }

        else if ((s.contains("current") || s.contains("now")) && s.contains("time")) {
            CurrentTime t = new CurrentTime();
            String time = t.getTime();

            text = "Current time is " + time;
            v.speak(text);
        }

        else if (s.substring(0, 4).equals("Open")) {
            if (s.contains("Open") && s.contains("app")) {
                if (s.substring(0, 8).equals("Open app"))  {
                    OpenApp o = new OpenApp();
                    text = o.openApp(s);
                    v.speak(text);
                }
            }

            else {
                Search a = new Search();
                text = "Curie Opened " + a.find(s) + " for you!";
                v.speak(text);
            }
        }

        else if (s.substring(0, 5).equals("Close")) {
            CloseApp c = new CloseApp();
            text = c.closeApp(s);
        }

        else if (s.substring(0,6).equals("Create")) {
            OpenCalendar o = new OpenCalendar();
            text = "Opening Calendar";
            v.speak(text);
            o.createEvent(s);
        }

        else if (s.substring(0, 4).equals("Play")) {
            Search a = new Search();
            text = "playing " + a.find(s);
            v.speak(text);
        }

        else if (s.contains("Weather") || s.contains("weather")) {
            Weather w = new Weather();
            text = w.getWeather();
            v.speak(text);
        }

        else if ((s.contains("Translate") || s.contains("translate")) && s.contains("Hindi")) {
            Translate t = new Translate();
            text = t.translate(s);
            v.speak(text);
        }

        else if (s.contains("Find") || s.contains("Show") || s.contains("Locate") || s.contains("Where") || s.contains("Search")) {
            FindPlace f = new FindPlace();
            text = f.findPlace(s);
            v.speak(text);
        }

        else if (s.contains("Shutdown") || s.contains("shutdown") || s.contains("Shut-down") ||s.contains("shut-down") || s.contains("Shut down") || s.contains("shut down")) {
            SystemOperation so = new SystemOperation();
            text = "Shutting down";
            v.speak(text);
            so.operation(s);
        }

        else if (s.contains("Restart") || s.contains("restart")) {
            SystemOperation so = new SystemOperation();
            text = "Restarting";
            v.speak(text);
            so.operation(s);
        }


        else {
            Search a = new Search();
            text = a.find(s);
            v.speak(text);
        }

        return text;
    }
}
