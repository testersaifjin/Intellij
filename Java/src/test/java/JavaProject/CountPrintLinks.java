package JavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountPrintLinks {

    public static void main(String[] args)
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaifJain\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://espresso.liber.se/modules_sv/news/index_ks1.html?source=espresso-home-foundationtopnav-menu-biet");


        List<WebElement> linksAll = driver.findElements(By.tagName("a"));
        System.out.println(linksAll.size());

        for (int i=0; i<=linksAll.size();i++)
            System.out.println(linksAll.get(i).getText()+""+linksAll.get(i).getAttribute("href"));
    }
}
