import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkTest {

    @Test
    public void testStudents () {
        WebDriver stdriver = new ChromeDriver();

        stdriver.get("http://37.59.228.229:3000/");
        stdriver.findElement(By.cssSelector("a[class='add-user btn-floating btn-large waves-effect waves-light red']")).click();
        stdriver.findElement(By.xpath("//input [@id=\"icon_prefix\"]")).clear();
        stdriver.findElement(By.xpath("//input [@id=\"icon_prefix\"]")).sendKeys("Hellboy");
        stdriver.findElement(By.xpath("//input [@id=\"icon_telephone\"]")).clear();
        stdriver.findElement(By.xpath("//input [@id=\"icon_telephone\"]")).sendKeys("123456789");
        stdriver.findElement(By.xpath("//a [@class='save-btn waves-effect waves-light btn']")).click();

        }
}
