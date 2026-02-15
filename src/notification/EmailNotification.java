package notification;

public class EmailNotification implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Trimit email: " + message);
    }
}
