package pageobjectpackage;

import commonpackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Homepage extends DriverFactory {
    public void baseurl(){
        driver.getCurrentUrl();
        driver.findElement(By.cssSelector("a[title='Tesco Clubcard']")).click();
        driver.findElement(By.linkText("Join Clubcard")).click();
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,800)");

        //driver.findElement(By.linkText("Accept and close")).click();
    }
    public void detail(){

        driver.findElement(By.id("username")).sendKeys("bhupen2007@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("Bhupen1979");
        driver.findElement(By.xpath("//*[@id=\"has-clubcard\"]/div[1]/label/span[1]")).click();

        Select dropdown=new Select(driver.findElement(By.id("title")));
        System.out.println(dropdown.getOptions().size());
        List<WebElement>options=dropdown.getOptions();
        for (WebElement option:options){
            System.out.println(option.getText());
            dropdown.selectByVisibleText("Mr");
        }
        driver.findElement(By.id("first-name")).sendKeys("Bhupendra");
        driver.findElement(By.id("last-name")).sendKeys("Nayee");
        driver.findElement(By.id("phone-number")).sendKeys("07515637193");
        driver.findElement(By.id("postcode")).sendKeys("RH10 5HH");
        driver.findElement(By.xpath("//*[@id=\"register-form\"]/fieldset[5]/div/button/span")).click();

        Select drop=new Select(driver.findElement(By.id("address-dropdown")));
        System.out.println(drop.getOptions().size());
        List<WebElement>opt=drop.getOptions();
        for(WebElement o:opt){
            System.out.println(o.getText());
            drop.selectByIndex(14);
            break;

        }
        driver.findElement(By.xpath("//*[@id=\"register-form\"]/fieldset[6]/div/div/div[2]/div[3]/div/label/span[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"register-form\"]/fieldset[6]/div/div/div[2]/div[4]/div/label/span[1]/span")).click();
    }
}
