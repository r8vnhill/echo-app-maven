package cl.ravenhill;

import cl.ravenhill.echo.EchoUtils;

/**
 * Entry point for the application.
 * <p>
 * This class reads command-line arguments and echoes each one to the standard output using the 
 * {@link EchoUtils#echoMessage(String)} method.
 * </p>
 */
public class App {

    /**
     * Main method that processes input arguments.
     *
     * @param args An array of command-line arguments to echo.
     */
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(EchoUtils.echoMessage(arg));
        }
    }
}
