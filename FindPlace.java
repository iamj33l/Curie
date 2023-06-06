package org.curie;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FindPlace {
    String findPlace(String text) throws URISyntaxException, IOException {
        String s = null;
        if (text.contains("Find")) {
            s = text.replace("Find", "");
        }

        if (text.contains("Search")) {
            s = text.replace("Search", "");
        }

        if (text.contains("Locate")) {
            s = text.replace("Locate", "");
        }

        if (text.contains("Show")) {
            s = text.replace("Show", "");
        }

        if (text.contains("Where is")) {
            s = text.replace("Where is", "");
        }

        if (text.contains("Where's")) {
            s = text.replace("Where's", "");
        }

        String place = null;
        if (s != null) {
            place = s.replace(" ", "+");
        }

        Desktop google = Desktop.getDesktop();
        google.browse(new URI("https://www.google.co.in/maps/search/" + place.substring(0, place.length() - 1)));

        return "Opening Google Maps";
    }
}
