import java.util.ArrayList;

interface Observer
{
    void update(float temp);
}

interface Subject
{
    void attach(Observer obj);
    void detach(Observer obj);
    void notifyChanges();
}
class WeatherStationIn implements Subject{
    public float temp;
    ArrayList<Observer> list= new ArrayList<>();

    public void setTemp(float temp)
    {
        this.temp= temp;
        notifyChanges();
    }

    @Override
    public void attach(Observer obj)
    {
        list.add(obj);
    }

    @Override
    public void detach(Observer obj)
    {
        list.remove(obj);
    }

    @Override
    public void notifyChanges()
    {
        for(Observer obj: list)
        {
            obj.update(temp);
        }
    }

}

class MobileDevice implements Observer
{
    @Override
    public void update(float temp)
    {
        System.out.println("Temperature on Mobile Device is: "+temp);
    }
}

class TabletDevice implements Observer
{
    @Override
    public void update(float temp)
    {
        System.out.println("Temperature on Tablet Device is: "+temp);
    }
}
public class ObserverPatternMain {
    public static void main(String[] args) {
        WeatherStationIn ws= new WeatherStationIn();
        MobileDevice device1= new MobileDevice();
        TabletDevice device2= new TabletDevice();

        ws.attach(device1);
        ws.attach(device2);

        ws.setTemp(39);

    }
}
