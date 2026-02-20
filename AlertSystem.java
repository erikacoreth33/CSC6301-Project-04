import java.util.ArrayList;

/**
 * AlertSystem manages notifications by delegating message delivery
 * to a NotificationMedium. The medium can be swapped at runtime,
 * demonstrating composition over inheritance.
 *
 * Design guidance and iterative feedback for this class were supported
 * by generative AI (ChatGPT) to help reason about composition, method
 * structure, and documentation best practices. Final implementation
 * and integration were completed by the author.
 *
 * @author Erika Coreth
 */
public class AlertSystem {

    /** The current notification medium */
    private NotificationMedium medium;

    /** Log of all messages sent during this session */
    private ArrayList<String> log;

    /**
     * Constructs an AlertSystem with an empty message log.
     */
    public AlertSystem() {
        log = new ArrayList<>();
    }

    /**
     * Sets (or swaps) the notification medium used by this system.
     *
     * @param medium the notification medium to use
     */
    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
    }

    /**
     * Sends a message using the currently active notification medium
     * and records it in the log.
     *
     * @param message the message to send
     */
    public void notifyUser(String message) {
        if (medium != null) {
            medium.send(message);
            log.add(message);
        } else {
            System.out.println("No notification medium set.");
        }
    }

    /**
     * Returns the log of all messages sent during this session.
     *
     * @return list of sent messages
     */
    public ArrayList<String> getLog() {
        return log;
    }
}
