package payment;

public class CardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Plata cu cardul: " + amount + " MDL");
    }
}
