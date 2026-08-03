
import java.net.URI;
import java.util.function.Predicate;

public class AuthenticationPopup {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/basic_auth");

        driver.quit();
    }
}
