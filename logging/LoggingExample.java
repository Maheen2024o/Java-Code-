package logging;

import java.util.logging.*;

public class LoggingExample {

    // Initialize logger
    private static final Logger LOGGER = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        // Configure logger levels (Optional: default is Level.INFO)
        LOGGER.setLevel(Level.INFO);

        // Log messages at different levels
        LOGGER.severe("This is a severe message.");
        LOGGER.warning("This is a warning message.");
        LOGGER.info("This is an informational message.");
        LOGGER.config("This is a configuration message.");
        LOGGER.fine("This is a fine-grained informational message.");
        LOGGER.finer("This is a finer-grained informational message.");
        LOGGER.finest("This is the finest-grained informational message.");

        // Example exception logging
        try {
            int result = 10 / 0; // ArithmeticException: divide by zero
        } catch (ArithmeticException e) {
            LOGGER.log(Level.SEVERE, "Exception occurred: ", e);
        }
    }
}