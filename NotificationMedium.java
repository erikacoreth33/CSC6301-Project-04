/**
 * Defines a notification method (medium) for sending messages.
 * This interface enables composition by allowing the AlertSystem
 * to delegate sending behavior to different implementations.
 *
 * @author Erika Coreth
 */
public interface NotificationMedium {

    /**
     * Sends a notification message using this medium.
     *
     * @param message the message to send
     */
    void send(String message);
}
// I used AI to help with sorting the different java files and organziing my code. I lost points last time for not having seperate files so I used AI for it to explain it to me this time. 