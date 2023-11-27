package userManager.Login;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import validator_and_check.Check.PasswordMatch;

public class PasswordSecurity {
    private final BCryptPasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

    public boolean isMatch(String password , String dataPassword){
       if( PASSWORD_ENCODER.matches(password,dataPassword)){
           return true;
       }return false;
    }

}
