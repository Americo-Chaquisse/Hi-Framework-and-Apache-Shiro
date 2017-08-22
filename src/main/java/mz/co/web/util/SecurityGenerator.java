package mz.co.web.util;

import org.apache.shiro.authc.credential.DefaultPasswordService;
import org.apache.shiro.authc.credential.PasswordService;

/**
 * @author Americo Chaquisse
 */
public class SecurityGenerator {

    public static String encript(String string){

        PasswordService passwordService = new DefaultPasswordService();

        String encryptedPassword = passwordService.encryptPassword(string);

        //do things like update the user password on database

        return encryptedPassword;

    }
}
