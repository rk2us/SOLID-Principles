package solid.OCP;

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment  = new CreditCardPayment();
        UpiPayment upiPayment = new UpiPayment();
        creditCardPayment.pay();
        upiPayment.pay();
    }
}
