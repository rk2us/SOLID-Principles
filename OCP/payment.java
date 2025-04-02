package solid.OCP;

public interface payment {
 void  pay();
}

class CreditCardPayment implements payment{

    @Override
    public void pay() {
        System.out.println("Processing credit card payment....");
    }
}


class UpiPayment implements payment{

    @Override
    public void pay() {
        System.out.println("Processing UpiPayment payment....");
    }
}
