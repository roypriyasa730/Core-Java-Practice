package Exception;

public class AgeInvalidException extends Exception {
    public String getMessage() {
        return "your age is not within the range of 18 to 100";
    }
}
