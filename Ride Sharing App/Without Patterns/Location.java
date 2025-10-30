public class Location {
    private double latitude;
    private double longitude;
    public Location(double la, double lo)
    {
        this.latitude=la;
        this.longitude=lo;
    }

    public double getLatitude()
    {
        return this.latitude;
    }

    public double getLongitude()
    {
        return this.longitude;
    }
}
