import java.util.HashMap;

class Bullet {
    private BulletType type; // Intrinsic property shared by all bullets
    private int x, y;      // Extrinsic properties unique to each bullet
    private int velocity;

    public Bullet(String color, int x, int y, int velocity) {
        this.type = BulletTypeFactory.getBulletType(color);
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("Creating bullet at (" + x + ", " + y + ") with velocity " + velocity+ "haing color"+ type.getColor());
    }
    public void display() {
        System.out.println("Bullet at (" + x + ", " + y + ") moving at velocity " + velocity+ "haing color"+ type.getColor());
    }
}
class BulletType {
    private String color; //Intrinsic Property

    public BulletType(String color){
        this.color = color;
        System.out.println("Creating bulletType with color " + color);
    }
    public String getColor()
    {
        return this.color;
    }
}
class BulletTypeFactory {
    private static final HashMap<String,BulletType> bulletTypes = new HashMap<>();

    public static BulletType getBulletType(String color){
        if(!bulletTypes.containsKey(color)){
            bulletTypes.put(color,new BulletType(color));
        }
        return bulletTypes.get(color);
    }
}
public class Game {
    public static void main(String[] args) {
        // 5 Red Bullet Objects
        for(int i=0;i<5;i++){
            new Bullet("Red",i*10,i*12,5);
        }
        // 5 Green Bullet Objects
        for(int i=0;i<5;i++){
            new Bullet("Green",i*10,i*12,5);
        }

    }
}
