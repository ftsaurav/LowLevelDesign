public class Driver {
    String name;
    Vehicle vehicle;
    Location location;

    public Driver(String n, Vehicle v, Location l)
    {
        this.name=n;
        this.vehicle=v;
        this.location=l;
    }

    public Location getLocation()
    {
        return location;
    }

    public void setLocation(Location location)
    {
        this.location= location;
    }
}
