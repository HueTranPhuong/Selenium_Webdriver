import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // lay duong dan thu muc goc ;  user.dir là pẩm mặc định của hàm string
        String projectPath = System.getProperty("user.dir");

        //tro duong dan den edge driver
        //System.setProperty("webdriver.edge.driver", projectPath + "/web_drivers/msedgedriver.exe"); // nếu firefox thì là gecko
        System.setProperty("webdriver.opera.driver", projectPath + "/web_drivers/operadriver.exe"); // nếu firefox thì là gecko


        //khoi tao 1 doi tuong edge driver
        //WebDriver driver = new EdgeDriver(); // nếu firefox thì là FirefoxDriver
        WebDriver driver = new OperaDriver(); // nếu firefox thì là FirefoxDriver


        // mở full màn hình windown
        driver.manage().window().maximize();

        //dieu huong den trang google
        driver.get("https://google.com");

        // dung man hinh 5000 mini s
        Thread.sleep(5000);

        // dong cua so trinh duyet
        driver.quit();
    }
}