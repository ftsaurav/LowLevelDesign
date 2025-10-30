public class Passenger extends User{

    public Passenger(String n, Location l)
    {
        super(n, l);

    }

    @Override
    public void notify(String msg)
    {
        System.out.println(msg);
    }
}
