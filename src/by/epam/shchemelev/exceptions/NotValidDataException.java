package by.epam.shchemelev.exceptions;

public class NotValidDataException extends Exception{
    public NotValidDataException() {
        super();
    }

    public NotValidDataException(String message) {
        super(message);
    }

    public NotValidDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotValidDataException(Throwable cause) {
        super(cause);
    }
}
