package checking_the_input;

import java.util.regex.Pattern;

public class CheckInput {
    // check input for phone number
    public boolean phoneNumber(String phone) {
        String p1 = "^[0-9+;,*#]+$";
        boolean m1 = Pattern.matches(p1, phone);
        return m1;
    }

    // check input for email address
    public boolean email(String mail) {
        String p2 = "^[\\w\\d_][\\w\\d_.]*@[\\w\\d_.]+$";
        boolean m2 = Pattern.matches(p2, mail);
        return m2;
    }
}



