public interface FareStrategy {
    double calFare(Vehicle vehicle, double distance);
}

class StandardFareStrategy implements FareStrategy{

    @Override
    public double calFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm()*distance;
    }

}

class SharedFareStrategy implements FareStrategy{

    @Override
    public double calFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm()*distance*.5;
    }

}

class LuxuryFareStrategy implements FareStrategy{

    @Override
    public double calFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm()*distance*1.5;
    }

}
