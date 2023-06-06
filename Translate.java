package org.curie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Translate {
    String translate(String search) {
        String search2 = search.replace(" ", "+");
        System.setProperty("webdriver.chrome.driver", "C:\\Curie\\src\\main\\java\\org\\curie\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/search?q=" + search2);
        String a = driver.findElement(By.className("oSioSc")).getText();
        String b = a.replace("Verified", "");
        return a;
    }

    public static void main(String[] args) {
        Translate t = new Translate();
        System.out.println(t.translate("translate hello in hindi"));
    }
}