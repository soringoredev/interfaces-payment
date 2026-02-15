package payment;

public class CryptoPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Plata cu crypto: " + amount + " USDT");
    }
}


