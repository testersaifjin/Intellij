package JavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintLinks {

    public static void main(String[] args)
    {
        WebDriver driver;
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://google.co.uk/");


        List<WebElement> print = driver.findElements(By.tagName("a"));
        System.out.println(print.size());

        for (int i=0; i<=print.size(); i++)
            System.out.println(print.get(i).getText()+"**********"+print.get(i).getAttribute("href"));
    }
}
