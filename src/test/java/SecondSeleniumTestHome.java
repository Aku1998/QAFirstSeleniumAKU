import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SecondSeleniumTestHome {
    WebDriver shop;

    @BeforeMethod

    public void setShop(){
        shop=new ChromeDriver();
        shop.get("https://demowebshop.tricentis.com/");
        shop.manage().window().minimize();

    }
    @Test
    public void testFindElementsTagName() {

        WebElement id = shop.findElement(By.cssSelector("#bar-notification"));
        System.out.println(id.getText());

        WebElement a = shop.findElement(By.cssSelector("#dialog-notifications-success"));
        System.out.println(a);

        List<WebElement> elements_a = shop.findElements(By.tagName("meta"));
        System.out.println(elements_a.size());

        WebElement b = shop.findElement(By.tagName(" script"));
        System.out.println(b);
    }
    @Test
    public void testFindElementsXpathHomeWork(){

        shop.findElement(By.xpath("//*[@class='master-wrapper-content']"));
        shop.findElement(By.xpath("//*[@id='dialog-notifications-success']"));
        shop.findElement(By.xpath(" //div[@id='dialog-notifications-error']"));
        shop.findElement(By.xpath("//input[contains(@id,'dialog-notifications-success')]"));
        shop.findElement(By.xpath("//div[contains(@class,'error')]" ));
    }

    @AfterMethod(enabled = true)
    public void tearDown() {
        shop.quit();
    }
}
