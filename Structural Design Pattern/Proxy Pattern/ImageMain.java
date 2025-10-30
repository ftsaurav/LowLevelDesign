interface Image{
    void display();
}
class RealImage implements Image
{
    public String fileName;
    public RealImage(String filename)
    {
        this.fileName= filename;
        loadImage();
    }
    public void loadImage()
    {
        System.out.println("loading image "+fileName);
    }

    @Override
    public void display()
    {
        System.out.println("displaying image");
    }
}
class ProxyImage implements Image
{
    public String fileName;

    private RealImage realImage;

    public ProxyImage(String filename)
    {
        this.fileName=filename;
    }

    @Override
    public void display()
    {
        if(realImage==null)
        {
            realImage= new RealImage(fileName);
        }
        realImage.display();
    }
}
public class ImageMain {
    public static void main(String[] args) {
        Image image= new RealImage("img.png");
        image.display();

        Image image2= new ProxyImage("png.png");
        image2.display();
    }
}
