/**
 * Entry point for the Flexible Notification System.
 * Demonstrates swapping notification mediums using composition.
 *
 * @author Erika Coreth
 */
public class Main {

    /**
     * Runs a simple demo showing email vs SMS notifications
     * and prints the session log.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        AlertSystem alertSystem = new AlertSystem();

        // Start with Email
        alertSystem.setMedium(new EmailService());
        alertSystem.notifyUser("Welcome! Your account has been created.");

        // Swap to SMS
        alertSystem.setMedium(new SMSService());
        alertSystem.notifyUser("Your verification code is 123456.");

        // Swap to WhatsApp
        alertSystem.setMedium(new WhatsAppService());
        alertSystem.notifyUser("This is a WhatsApp alert.");


        // Print the log
        System.out.println("\n--- Session Log ---");
        for (String msg : alertSystem.getLog()) {
            System.out.println(msg);
        }
    }
}
