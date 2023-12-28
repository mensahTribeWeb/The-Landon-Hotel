package edu.wgu.d387_sample_code.convertor;

import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeMessageProvider implements Runnable {

    public static String[] getWelcomeMessages(){
        String[] messages = new String[2];

        // English
        Locale enLocale = new Locale("en", "US");
        ResourceBundle enBundle = ResourceBundle.getBundle("i18n/welcome", enLocale);
        messages[0] = enBundle.getString("welcome.message");

        // French
        Locale frLocale = new Locale("fr", "CA");
        ResourceBundle frBundle = ResourceBundle.getBundle("i18n/welcome", frLocale);
        messages[1] = frBundle.getString("welcome.message");

        return messages;
    }

    @Override
    public void run() {
        
    }
}
