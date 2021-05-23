package exception;

public class InvalidIdException extends Exception{
    public InvalidIdException(int id) {
        super("The game with " + id + " is not in the database.");
    }
}
