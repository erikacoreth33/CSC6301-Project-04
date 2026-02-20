/**
 * Sends notifications using an SMS-style delivery method.
 * This is another concrete implementation of NotificationMedium.
 *
 * @author Erika Coreth
 */
public class SMSService implements NotificationMedium {

    /**
     * Sends the provided message using "SMS".
     *
     * @param message the message to send
     */
    @Override
    public void send(String message) {
        System.out.println("[SMS] " + message);
    }
}
