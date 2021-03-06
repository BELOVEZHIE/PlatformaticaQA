import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class GroupEastern extends BaseTest {

    @Test
    public void viktoriiaPrudka() {

        WebDriver driver = getDriver();
        driver.get("https://wagwalking.com/");

        WebElement button = driver.findElement(By.xpath("//p[text()='Book a walk']"));
        button.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://app.wagwalking.com/signup/welcome?preferred_service=1&utm_campaign=service_carousel_walking&utm_medium=homepage&utm_source=web");
    }

    @Test
    public void irinaKalinichenko() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.get("https://www.underarmour.com/en-us/");

        WebElement text = driver.findElement(By.xpath("//span[text()='Knock out your gift list with FREE SHIPPING, orders $60+.']"));
        text.click();
        //  Let us help you find the perfect gift — without getting up.
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.underarmour.com/en-us/c/top-gifts/");
        //Thread.sleep(3000);
    }

}
