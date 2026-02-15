package notification;

public class PushNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Trimit push notification: " + message);
    }
}
