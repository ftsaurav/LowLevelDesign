import java.util.ArrayList;

public class RideMatchingSystem {
    ArrayList<Driver> driversList= new ArrayList<>();
    public void addDriver(Driver driver)
    {
        driversList.add(driver);
    }
    public void bookRide(Passenger passenger, double distance, FareStrategy fareStrategy)
    {
        if(driversList.isEmpty())
        {
            passenger.notify("No rides available at the time");
            return;
        }
        Driver nearstDriver= getNearestDriver(passenger.getLocation());
        Ride ride= new Ride(passenger, nearstDriver, distance, fareStrategy);
        ride.updateStatus(RideStatus.SCHEDULED);


        ride.calculateFare();

        passenger.notify("Your ride is Successfully booked with cost: "+ride.getFare());
        nearstDriver.notify("You have a new ride with cost: "+ride.getFare());

        ride.updateStatus(RideStatus.ONGOING);

        ride.updateStatus(RideStatus.COMPLETED); 
    }

    public Driver getNearestDriver(Location location)
    {
        Driver assignedDriver= null;
        double minDriverDistance= Double.MAX_VALUE;

        for(Driver driver: driversList)
        {
            double currDriverDistance= driver.getLocation().calDriverDist(location);
            if(currDriverDistance<minDriverDistance)
            {
                minDriverDistance= currDriverDistance;
                assignedDriver= driver;
            }
        }
        return assignedDriver;
    }
}
