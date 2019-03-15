import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWorkTest {

    @Test
    public void testStudents () {
        WebDriver driver = new ChromeDriver();

        driver.get("http://37.59.228.229:3000/");
        driver.findElement(By.cssSelector("a[class='add-user btn-floating btn-large waves-effect waves-light red']")).click();
        driver.findElement(By.xpath("//input [@id=\"icon_prefix\"]")).clear();
        driver.findElement(By.xpath("//input [@id=\"icon_prefix\"]")).sendKeys("Hellboy");
        driver.findElement(By.xpath("//input [@id=\"icon_telephone\"]")).clear();
        driver.findElement(By.xpath("//input [@id=\"icon_telephone\"]")).sendKeys("123456789");
        //Select role = new Select(driver.findElement(By.xpath("//select[@class ='initialized']")));
        //role.selectByValue("Admin");
        driver.findElement(By.xpath("//a [@class='save-btn waves-effect waves-light btn']")).click();

        }
}
