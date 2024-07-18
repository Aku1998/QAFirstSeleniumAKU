import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondSeleniumTestHome {
    WebDriver shop;

    @BeforeMethod

    public void setShop(){
        shop=new ChromeDriver();
        shop.get("https://demowebshop.tricentis.com/");
        shop.manage().window().minimize();

    }
    @Test
    public void newWindow(){
        System.out.println("the window is open");
    }
    @AfterMethod
    public void shop(){
        shop.getWindowHandle();
    }
}
