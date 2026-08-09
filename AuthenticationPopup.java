
import java.net.URI;
import java.util.function.Predicate;

public class AuthenticationPopup {

    public static void main(String[] args) {

        Predicate<String> isValidUrl = url -> {
            try {
                URI uri = new URI(url);
                return uri.getScheme() != null && (uri.getScheme().equals("http") || uri.getScheme().equals("https"));
            } catch (Exception e) {
                return false;
            }
        };

        String url1 = "https://www.example.com";
        String url2 = "ftp://www.example.com";

        System.out.println("Is valid URL 1: " + isValidUrl.test(url1)); // true
        System.out.println("Is valid URL 2: " + isValidUrl.test(url2)); // false
    }
}
