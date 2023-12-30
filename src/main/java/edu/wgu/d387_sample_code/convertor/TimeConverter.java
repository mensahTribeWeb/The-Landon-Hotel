package edu.wgu.d387_sample_code.convertor;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Utility class for converting and formatting times in different time zones.
 */
public class TimeConverter {

    /**
     * Retrieves the current time in Eastern Time (ET), Mountain Time (MT), and Coordinated Universal Time (UTC).
     *
     * @return A string containing the formatted times in ET, MT, and UTC.
     */
    public static String getTime() {
        ZonedDateTime time = ZonedDateTime.now();

        ZonedDateTime ET = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime MT = time.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime UTC = time.withZoneSameInstant(ZoneId.of("UTC"));

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM d, u");
        String formattedDate = LocalDate.now().format(dateFormatter);

        String timePattern = "hh:mm a";
        DateTimeFormatter timePatternFormatter = DateTimeFormatter.ofPattern(timePattern);

        return "Join us for an online live presentation  held at the London Hotel on " +
                formattedDate + " at : \n\n" +
                ET.format(timePatternFormatter) + " Eastern Time \n\n" +
                MT.format(timePatternFormatter) + " Mountain Time \n\n" +
                UTC.format(timePatternFormatter) + " UTC";
    }
}