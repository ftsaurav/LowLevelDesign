import java.util.ArrayList;

public class RideSharingApp {
    ArrayList<Driver> driversList= new ArrayList<>();
    ArrayList<Passenger> passengerList= new ArrayList<>();

    public void addDriver(Driver driver)
    {
        driversList.add(driver);
    }

    public void addPassanger(Passenger passenger)
    {
        passengerList.add(passenger);
    }

    public void bookRide(Passenger passenger, double distance)
    {
        if(driversList.isEmpty())
        {
            System.out.println("No rides Available");
            return;
        }
        Driver assignedDriver= null;
        double minDriverDistance= Double.MAX_VALUE;

        for(Driver driver: driversList)
        {
            double currDriverDistance= calDriverDist(passenger.location, driver.location);
            if(currDriverDistance<minDriverDistance)
            {
                minDriverDistance= currDriverDistance;
                assignedDriver= driver;
            }
        }
        driversList.remove(assignedDriver);

        double expectedFair= calFare(assignedDriver.vehicle, distance);
        System.out.println("Ride booked successfully");
        System.out.println("Passenger name: "+ passenger.name);
        System.out.println("Rider name: "+assignedDriver.name);
        System.out.println("Expected Fair is: "+expectedFair);
    }

    private double calDriverDist(Location l1, Location l2)
    {
        double dx= l1.getLatitude() - l2.getLatitude();
        double dy= l1.getLongitude() - l2.getLongitude();

        return Math.sqrt((dx*dx) + (dy*dy));
    }

    private double calFare(Vehicle vehicle, double distance)
    {
        if(vehicle.type.equals("Car"))
        {
            return distance*20;
        }
        else if(vehicle.type.equals("Bike"))
        {
            return distance*10;
        }
        else
        {
            return distance*8;
        }
    }
}
