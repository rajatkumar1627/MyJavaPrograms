class Computer
{
    public void playMusic()
    {
        System.out.println("Music is playing..");
    }

    public String getMePen(int cost)
    {
        if (cost>=10) 
        {
            return "Pen";
        } 
        else 
        {
           return "Nothing";
        }
        
    }
}
public class demo1 
{
    public static void main(String a[])
    {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen(10);
        System.out.println(str);
    }
}
