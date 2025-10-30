enum TransportationMode{
    WALK, CAR, BIKE, CYCLING
}
class DirectionService{
    private TransportationMode mode;
    public void setMode(TransportationMode mode)
    {
        this.mode= mode;
    }
    public int calETA()
    {
        switch (mode) {
            case WALK:
                System.out.println("Estimated time for arrival is 10 mints");
                return 10;
            case CAR:
                System.out.println("Estimated time for arrival is 8 mints");
                return 8;
            case BIKE:
                System.out.println("Estimated time for arrival is 6 mints");
                return 6;
            case CYCLING:
                System.out.println("Estimated time for arrival is 4 mints");
                return 4;
            default:
                System.out.println("Mode of transport is not valid");
                return -1;
        }
    }
    public void getDirections()
    {
        switch (mode) {
            case WALK:
                System.out.println("Walking distance");
                break;
            case CAR:
                System.out.println("Car distance");
                break;
            case BIKE:
                System.out.println("Bike distance");
                break;
            case CYCLING:
                System.out.println("Cycling distance");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
public class WithoutStatePattern {
    public static void main(String[] args) {
        DirectionService ds= new DirectionService();
        ds.setMode(TransportationMode.CYCLING);
        ds.calETA();
        ds.getDirections();
    }
}
