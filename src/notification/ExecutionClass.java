package notification;

public class ExecutionClass {
    public static void main(String[] args) {

        NotificationService service = new SmsNotification();
        NotificationManager manager = new NotificationManager(service);

        manager.notifyUser("Buna ziua, Va rog a va prezentat la ore!! ");



    }
}
