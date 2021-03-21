package exceptions;

public class NoItemFoundException extends Exception{
    public NoItemFoundException(String name) {
        super(name + " was not found in the catalog.");
    }
}
