package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.convertor.DisplayWelcomeMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;
/**
 * The {@code WelcomeController} class is a Spring MVC controller that
 * handles requests related to welcome messages in different languages.
 */
@RestController
@RequestMapping("/welcome")
@CrossOrigin(origins = "http://localhost:4200")
public class WelcomeController {

    /**
     * Retrieves a welcome message based on the specified language.
     *
     * @param lang The language for which the welcome message is requested.
     *             The language should be specified using language tags (e.g., "en-US").
     * @return A {@code ResponseEntity} containing the welcome message and HTTP status.
     */
    @GetMapping
    public ResponseEntity<String> getWelcomeMessages(@RequestParam("lang") String lang) {
        // Convert the language tag to a Locale object.
        Locale locale = Locale.forLanguageTag(lang);

        // Create a DisplayWelcomeMessage instance with the specified locale.
        DisplayWelcomeMessage message = new DisplayWelcomeMessage(locale);

        // Return a ResponseEntity with the welcome message and HTTP status OK.
        return new ResponseEntity<>(message.getWelcomeMessage(), HttpStatus.OK);
    }
}