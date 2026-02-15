package payment;

public class ApplePayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Plata cu Apple Pay " + amount + " MDL");
    }
}
