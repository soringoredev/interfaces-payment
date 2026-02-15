package payment;

public class ExecutionClass {
    public static void main(String[] args) {

        PaymentMethod payment1 = new CardPayment();
        PaymentMethod payment2 = new CashPayment();
        PaymentMethod payment3 = new CryptoPayment();
        ApplePayment payment4  = new ApplePayment();

        payment1.pay(500);
        payment2.pay(200);
        payment3.pay(750);
        payment4.pay(100);

    }
}
