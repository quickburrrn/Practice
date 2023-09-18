import java.util.ArrayList;
import java.util.List;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String phonenumber = "(xxx)-xxx-xxxx";
        for (int i : numbers){
            phonenumber = phonenumber.replaceFirst("x", Integer.toString(i));
        }
        return phonenumber;
    }
}
