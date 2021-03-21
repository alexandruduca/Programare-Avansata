package exceptions;

import java.time.Year;

public class InvalidYearException extends Exception{

    public InvalidYearException(Year year) {
        super("Invalid year: " + year);
    }
}
