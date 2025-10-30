public class User{
    public static void main(String args[])
    {
        PaymentService ps= new PaymentService();
        ps.addPaymentMethod("CC", (PaymentMethod) new CreditCard("1234", "Saurav"));
        ps.MakePayment("CC");
    }
}