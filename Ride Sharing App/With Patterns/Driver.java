public class Driver extends User{
    private Vehicle vehicle;

    public Driver(String n, Location l, Vehicle v)
    {
        super(n, l);
        this.vehicle= v;

    }

    public Vehicle getVehicle()
    {
        return vehicle;
    }

    @Override
    public void notify(String msg)
    {
        System.out.println(msg);
    }
}
