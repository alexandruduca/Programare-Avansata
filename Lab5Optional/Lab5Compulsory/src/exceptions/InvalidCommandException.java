package exceptions;

public class InvalidCommandException extends Exception{
    public InvalidCommandException(String message) {
        super(message + " is an invalid command. Please try again");
    }
}
