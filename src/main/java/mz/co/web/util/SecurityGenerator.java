package mz.co.web.util;

import org.apache.shiro.authc.credential.DefaultPasswordService;
import org.apache.shiro.authc.credential.PasswordService;

/**
 * @author Americo Chaquisse
 * 
 * NOTE: This class is not being used in this example. 
 * Use it to encrypt passwords before persisting into the database
 */
public class SecurityGenerator {

    public static String encript(String string){

        PasswordService passwordService = new DefaultPasswordService();

        String encryptedPassword = passwordService.encryptPassword(string);

        return encryptedPassword;

    }
}
