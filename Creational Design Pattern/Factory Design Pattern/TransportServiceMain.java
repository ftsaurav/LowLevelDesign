interface Transport{
    void deliver();
}
class Car implements Transport{
    @Override
    public void deliver()
    {
        System.out.println("deliver by car");
    }
}
class Bus implements Transport{
    @Override
    public void deliver()
    {
        System.out.println("deliver by bus");
    }
}
class Bike implements Transport{
    @Override
    public void deliver()
    {
        System.out.println("deliver by bike");
    }
}
class TransportFactory{
    public static Transport createTransport(String type)
    {
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "bus":
                return new Bus();
            case "bike":
                return new Bike();
            default:
                throw new IllegalArgumentException("Type undefined");
        }
    }

}
public class TransportServiceMain {
    public static void main(String[] args) {
        Transport tf= TransportFactory.createTransport("car");
        tf.deliver();
        
    }
}
