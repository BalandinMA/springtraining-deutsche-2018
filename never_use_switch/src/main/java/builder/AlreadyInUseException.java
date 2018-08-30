package builder;

/**
 * @author Evgeny Borisov
 */
public class AlreadyInUseException extends RuntimeException {
    public AlreadyInUseException(String message) {
        super(message);
    }
}
