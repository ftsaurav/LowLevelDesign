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

    public double calDriverDist(Location l2)
    {
        double dx= this.getLatitude() - l2.getLatitude();
        double dy= this.getLongitude() - l2.getLongitude();

        return Math.sqrt((dx*dx) + (dy*dy));
    }


}
