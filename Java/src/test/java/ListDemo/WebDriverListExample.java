package ListDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverListExample {

    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();

        driver.findElements(By.xpath("")); //findElements - is a List

        Select sel = new Select(driver.findElement(By.xpath(""))); //getOption & getAllSelectedOptions are List using select class




    }
}
