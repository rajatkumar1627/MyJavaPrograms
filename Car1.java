abstract class Car              // Abstract class
{
    public abstract void drive();
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("Playing Music..");
    }
}
abstract class WagonR extends Car       // Abstract class
{
    public void drive()
    {
        System.out.println("Driving..");
    }
}

class UpdatedWagonR extends WagonR      // Concrete class
{
    public void fly()
    {
        System.out.println("Flying..");
    }
}
public class Car1 
{
    public static void main(String[] args) 
    {
        UpdatedWagonR obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
