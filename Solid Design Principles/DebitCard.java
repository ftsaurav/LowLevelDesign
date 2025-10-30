
public class DebitCard extends Card{

    public DebitCard(String c, String n) {
        super(c, n);
    }

    @Override
    public void pay()
    {
        System.out.println("Payment is done through Debit card");
    }
    
}
