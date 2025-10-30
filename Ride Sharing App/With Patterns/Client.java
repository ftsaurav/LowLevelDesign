public class Client {
    public static void main(String[] args) {
        Location location1= new Location(3.13, 1.45);
        Location location2= new Location(5.13, 5.45);
        Location location3= new Location(7.13, 11.45);

        Vehicle car= new Car("DL8SDK8906");
        Vehicle bike= new Bike("BR8SDK9781");

        Driver driver1= new Driver("John", location1, car);
        Driver driver2= new Driver("Alice", location2, bike);

        Passenger passenger1= new Passenger("Pass1", location1);
        Passenger passenger2= new Passenger("Pass2", location2);
        Passenger passenger3= new Passenger("Pass3", location3);

        RideMatchingSystem rideMatchingSystem= new RideMatchingSystem();
        rideMatchingSystem.addDriver(driver1);
        rideMatchingSystem.addDriver(driver2);

        rideMatchingSystem.bookRide(passenger1, 10, new StandardFareStrategy());
    }
}
