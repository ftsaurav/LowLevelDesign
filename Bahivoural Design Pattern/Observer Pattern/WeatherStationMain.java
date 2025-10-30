class DisplayDevice
{
    public void showTemp(float temp)
    {
        System.out.println("Temp is: "+temp+" C");
    }
}
class WeaterStation
{
    private float temp;
    DisplayDevice displayDevice= new DisplayDevice();
    public WeaterStation(DisplayDevice displayDevice)
    {
        this.displayDevice= displayDevice;
    }

    public void setTemp(float temp)
    {
        this.temp=temp;
        notifyChanges();
    }

    public void notifyChanges()
    {
        displayDevice.showTemp(temp);
    }
}
public class WeatherStationMain
{
    public static void main(String[] args)
    {
        WeaterStation ws= new WeaterStation(new DisplayDevice());
        ws.setTemp(35);
        ws.setTemp(90);
    }
}
