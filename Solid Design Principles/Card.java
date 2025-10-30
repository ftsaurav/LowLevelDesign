abstract class Card implements PaymentMethod{
    private String cardNo;
    private String name;

    public Card(String c, String n)
    {
        this.cardNo=c;
        this.name=n;
    }

    public String getcardNo()
    {
        return cardNo;
    }
    public String getName()
    {
        return name;
    }
}
