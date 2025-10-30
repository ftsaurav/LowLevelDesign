abstract class User {
    String name;
    Location location;

    public User(String name, Location location)
    {
        this.name= name;
        this.location= location;
    }

    public Location getLocation()
    {
        return location;
    }

    public void setLocation(Location location)
    {
        this.location= location;
    }

    abstract void notify(String msg);
    
}
