/**
 * Sends notifications using an email-style delivery method.
 * This is one concrete implementation of NotificationMedium.
 *
 * @author Erika Coreth
 */
public class EmailService implements NotificationMedium {

    /**
     * Sends the provided message using "email".
     *
     * @param message the message to send
     */
    @Override
    public void send(String message) {
        System.out.println("[EMAIL] " + message);
    }
}
// I references my @Override funciton from last project to help me here