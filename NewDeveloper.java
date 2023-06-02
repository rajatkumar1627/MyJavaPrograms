interface Computer
{
    void code();
}
class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Code, Complie & Run");
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Code, Complie & Run : Faster");
    }
}
class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}
public class NewDeveloper 
{
    public static void main(String[] args) 
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer rajat = new Developer();
        System.out.println("Developer with Desktop");
        rajat.devApp(lap);
        System.out.println("\n\nDeveloper with Laptop");
        rajat.devApp(desk);
    }
}
