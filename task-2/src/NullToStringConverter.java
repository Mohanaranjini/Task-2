
public class NullToStringConverter {

    public String changeNullToString(String inputString) {
        if (inputString == null) {
            return "empty";
        } else
            return inputString;

    }

}
