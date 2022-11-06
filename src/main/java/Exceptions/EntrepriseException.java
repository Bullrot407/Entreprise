package Exceptions;

public class EntrepriseException extends Exception {

    public EntrepriseException(String errorMessage) {
        super(errorMessage);
    }

    public EntrepriseException(String errorMessage, Throwable ex) {
        super(errorMessage, ex);
    }
}
