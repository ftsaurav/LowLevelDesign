interface TransportationMode{
    int getETA();
    String getDirections();
}
class Walking implements TransportationMode{

    @Override
    public int getETA()
    {
        System.out.println("Estimated time for Walking");
        return 5;
    }

    @Override
    public String getDirections()
    {
        return "Directions for Walking";
    }
}
class Bike implements TransportationMode{

    @Override
    public int getETA()
    {
        System.out.println("Estimated time for Bike");
        return 5;
    }

    @Override
    public String getDirections()
    {
        return "Directions for Bike";
    }
}
class DirectionService2{
    private TransportationMode mode;
    public void setMode(TransportationMode mode)
    {
        this.mode=mode;
    }

    public int getETA()
    {
        return mode.getETA();
    }
    public String getDirections()
    {
        return mode.getDirections();
    }
}
public class DirectionServiceMain {
    public static void main(String[] args) {
        DirectionService2 ds= new DirectionService2();
        ds.setMode(new Walking());
        System.out.println(ds.getDirections());
        System.out.println(ds.getETA());
    }
    
}
