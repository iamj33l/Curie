package org.curie;

import java.awt.Desktop;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    String find(String s) throws IOException, URISyntaxException {
        String default_search = s.replace(" ", "+");
        String Action = s.substring(0, 4);
        String Object = s.substring(5, s.length() - 1);
        String a = null;
        String b = null;
        String c = null;

        switch (Action) {
            case "Open":
                Desktop google = Desktop.getDesktop();
                google.browse(new URI("https://www." + Object + ".com"));
                a = Object;
                break;

            case "Play":
                String search = Object.replace(" ", "+");
                Desktop Spotify = Desktop.getDesktop();
                Spotify.browse(new URI("https://music.youtube.com/search?q=" + search));
                a = search;
                break;
            default:
                System.setProperty("webdriver.chrome.driver", "C:\\Curie\\src\\main\\java\\org\\curie\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.google.com/search?q=" + default_search);

                c = driver.findElement(By.className("kno-rdesc")).getText();
                b = c.replace("Description", "According to wikipedia, ");
                a = b.replace("Wikipedia", "");
                break;
            }
        return a;
    }
}
