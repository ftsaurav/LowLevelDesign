interface PaymentStrategy
{
    public void processPayment();
}

class PaymentService
{
    private PaymentStrategy strategy;
    public void setPaymentStrategy(PaymentStrategy strategy)
    {
        this.strategy=strategy;
    }

    public void pay()
    {
        strategy.processPayment();
    }
}

class CreditCard implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Making payment via Credit card");
    } 
}

class DebitCard implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Making payment via Debit card");
    }
}

public class PaymentServiceMain
{
    public static void main(String[] args) {
        PaymentService ps= new PaymentService();
        ps.setPaymentStrategy(new DebitCard());
        ps.pay();
    }
}
