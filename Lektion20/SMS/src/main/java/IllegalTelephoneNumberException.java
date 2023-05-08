public class IllegalTelephoneNumberException extends Exception {

    public IllegalTelephoneNumberException() {
        super();
    }

    public IllegalTelephoneNumberException(String message) {
        super(message);
    }

    public IllegalTelephoneNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalTelephoneNumberException(Throwable cause) {
        super(cause);
    }

    protected IllegalTelephoneNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
