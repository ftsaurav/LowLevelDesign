public class Client {
    public static void main(String[] args) {
        Location location1= new Location(3.13, 1.45);
        Location location2= new Location(5.13, 5.45);
        Location location3= new Location(7.13, 11.45);

        Vehicle vehicle1= new Vehicle("DL8SDK8906", "Car");
        Vehicle vehicle2= new Vehicle("BR8SDK9781", "Bike");
        Vehicle vehicle3= new Vehicle("UP8SDK9781", "Bus");

        Driver driver1= new Driver("John", vehicle1, location1);
        Driver driver2= new Driver("Alice", vehicle2, location2);
        Driver driver3= new Driver("Bob", vehicle3, location3);

        Passenger passenger1= new Passenger("Pass1", location1);
        Passenger passenger2= new Passenger("Pass2", location2);
        Passenger passenger3= new Passenger("Pass3", location3);

        RideSharingApp app= new RideSharingApp();

        app.addDriver(driver1);
        app.addDriver(driver2);
        app.addDriver(driver3);

        app.addPassanger(passenger1);
        app.addPassanger(passenger2);
        app.addPassanger(passenger3);

        app.bookRide(passenger1, 10);
        app.bookRide(passenger2, 10);
        app.bookRide(passenger3, 10);
        app.bookRide(passenger3, 10);
    }
}
