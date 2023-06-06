package org.curie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Weather {
    public String getWeather() {
        String temp = null;
        String whether = null;
        System.setProperty("webdriver.chrome.driver", "C:\\Curie\\src\\main\\java\\org\\curie\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/search?q=weather");

        temp = driver.findElement(By.className("UQt4rd")).getText();
        String temperature = "";
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '°') {
                break;
            }
            temperature += temp.charAt(i);
        }
        if (Integer.parseInt(temperature) > 30) {
            whether = "It's hot outside with "+ temperature + " degrees , you should wear a t-shirt";
        }

        else if (Integer.parseInt(temperature) < 30) {
            whether = "It's cold outside with " + temperature + " degress, you should wear a jacket";
        }

        else {
            whether = "It's a perfect day outside with " + temperature + " degrees, you should wear a t-shirt and a jacket";
        }

        return whether;
    }

    public static void main(String[] args) {
        Weather whether = new Weather();
        System.out.println(whether.getWeather());
    }
}
