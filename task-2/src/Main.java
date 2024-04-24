import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        EmailValidator emailValidator =new EmailValidator();
        DateConverter dateconverter = new DateConverter();
        NullToStringConverter nulltostringConverter =new NullToStringConverter();
        Adder adder = new Adder();
        String str= null;

        System.out.println(emailValidator.validateEmail("mohanaranjini15@gmail.com"));
        System.out.println(dateconverter.convertStringToDate("15-07-2023"));
        System.out.println(nulltostringConverter.changeNullToString(str));
        System.out.println(adder.add(17.5,13));
    }

}