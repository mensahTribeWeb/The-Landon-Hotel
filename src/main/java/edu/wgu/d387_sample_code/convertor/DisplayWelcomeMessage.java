package edu.wgu.d387_sample_code.convertor;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * The {@code DisplayWelcomeMessage} class is responsible for displaying
 * a welcome message based on a specified locale. It implements the {@code Runnable}
 * interface, allowing it to be executed in a separate thread.
 *
 * @author nick mensah
 */
public class DisplayWelcomeMessage implements Runnable {

    private final Locale locale;

    //Constructor
    public DisplayWelcomeMessage(Locale locale) {
        this.locale = locale;
    }

    /**
     * Gets the welcome message based on the specified locale. The message is
     * retrieved from the resource bundle named "i18n/welcome". The resource
     * bundle contains localized messages for different locales. The key used
     * to retrieve the message is "welcome.message".
     *
     * @return The welcome message for the specified locale.
     * @throws java.util.MissingResourceException If the message is not found for the given locale.
     */
            public String getWelcomeMessage () {
                // ResourceBundle is used to access locale messages from properties files.
                ResourceBundle resourceBundle = ResourceBundle.getBundle("i18n/welcome", locale);

                // Retrieve the welcome message using the key "welcome.message" from the resource bundle.
                return resourceBundle.getString("welcome.message");
            }

            @Override
            public void run () {

            }
        }