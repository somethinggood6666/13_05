package by.epam.shchemelev.exceptions;

public class NotValidNumberException extends Exception {

    public NotValidNumberException() {
        super();
    }

    public NotValidNumberException(String message) {
        super(message);
    }

    public NotValidNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotValidNumberException(Throwable cause) {
        super(cause);
    }
}
