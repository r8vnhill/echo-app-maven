package cl.ravenhill.echo;

/**
 * Utility class for echoing messages.
 * <p>
 * This class provides a simple method that returns the same string that was passed in.
 * It's useful for debugging, logging, or demonstrating basic input/output behavior.
 * </p>
 * <h2>Usage:</h2>
 * Inspired by *Mobile Suit Zeta Gundam* — imagine a Titan broadcast test:
 *
 * <pre>
 * String transmission = "This is AEUG. We are not your enemy.";
 * System.out.println(EchoUtils.echoMessage(transmission));
 * // Output: This is AEUG. We are not your enemy.
 * </pre>
 */
public class EchoUtils {

    /**
     * Returns the input message as-is.
     *
     * @param message The message to echo.
     * @return The same message that was passed in.
     */
    public static String echoMessage(String message) {
        return message;
    }
}
