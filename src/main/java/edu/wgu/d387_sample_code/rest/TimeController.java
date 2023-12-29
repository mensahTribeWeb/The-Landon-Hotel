package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.convertor.TimeConverter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for handling time zone conversion requests.
 */
@RestController
@RequestMapping("/api/time")
public class TimeController {

    /**
     * Handles a GET request to "/api/time/zones" and returns the current times in ET, MT, and UTC.
     *
     * @return ResponseEntity with a string containing the formatted times.
     */
    @GetMapping("/zones")
    public ResponseEntity<String> convertTimeZones() {
        String times = TimeConverter.getTime();
        return ResponseEntity.ok(times);
    }
}